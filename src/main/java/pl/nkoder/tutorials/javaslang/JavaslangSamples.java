package pl.nkoder.tutorials.javaslang;

import javaslang.Function1;
import javaslang.Tuple;
import pl.nkoder.tutorials.javaslang.helpers.Coordinates;

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

}
