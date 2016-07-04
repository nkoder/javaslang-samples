package pl.nkoder.tutorials.javaslang;

import com.google.common.collect.Lists;
import javaslang.Function1;
import javaslang.Function2;
import javaslang.Tuple;
import javaslang.collection.List;
import javaslang.control.Option;
import pl.nkoder.tutorials.javaslang.helpers.Coordinates;

import java.util.function.Function;

import static java.lang.String.format;
import static javaslang.Function1.lift;

class JavaslangSamples extends Samples {

    private final Function1<Integer, Integer> add5 = number -> number + 5;
    private final Function1<Integer, Integer> multiplyBy3 = number -> number * 3;

    @Override
    public Coordinates rotateClockwiseAndMultiplyBy10(Coordinates originalCoordinates) {
        return Tuple.of(originalCoordinates.x, originalCoordinates.y)
            .map((x, y) -> Tuple.of(y, -x))
            .map(
                x -> 10 * x,
                y -> 10 * y
            )
            .transform((x, y) -> Coordinates.of(x, y));
    }

    @Override
    public int add5AndMultiplyBy3(int number) {
        return add5.andThen(multiplyBy3).apply(number);
    }

    @Override
    public int multiplyBy3AndAdd5(int number) {
        return add5.compose(multiplyBy3).apply(number);
    }

    @Override
    public String addAnSheepTo(String sheepAsText) {
        return lift(this::parseSheepIn)
            .apply(sheepAsText)
            .map(sheep -> format("%s sheep", sheep + 1))
            .getOrElse("You know nothing, John Snow");
    }

    @Override
    Iterable<Integer> countOccurrences(char characterToCount, Iterable<String> words) {
        Function1<String, Integer> countCharacter = Function2.<Character, String, Integer>of(this::countOccurrences)
            .curried()
            .apply(characterToCount);
        return List.ofAll(words)
            .map(countCharacter)
            .transform(Lists::newArrayList);
    }

    @Override
    <V, R> Iterable<R> compute(Function<V, R> function, Iterable<V> values) {
        Function1<V, R> slangedFunction = value -> function.apply(value);
        Function1<V, R> cachedFunction = slangedFunction.memoized();
        return List.ofAll(values)
            .map(cachedFunction)
            .transform(Lists::newArrayList);
    }

    @Override
    Iterable<Integer> validIntegersFrom(Iterable<String> integersAsText) {
        return List.ofAll(asOptionalIntegers(integersAsText))
            .map(Option::ofOptional)
            .flatMap(presentOption -> presentOption);
    }

}
