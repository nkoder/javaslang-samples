package pl.nkoder.tutorials.javaslang;

import pl.nkoder.tutorials.javaslang.helpers.Coordinates;

import java.util.Collection;
import java.util.Map;
import java.util.function.Function;

import static com.google.common.collect.Maps.newHashMap;
import static java.lang.String.format;
import static java.util.stream.Collectors.toList;

class Java8Samples extends Samples {

    private final Function<Integer, Integer> add5 = number -> number + 5;
    private final Function<Integer, Integer> multiplyBy3 = number -> number * 3;

    @Override
    public Coordinates rotateClockwiseAndMultiplyBy10(Coordinates originalCoordinates) {
        int newX = 10 * originalCoordinates.y;
        int newY = 10 * -originalCoordinates.x;
        return Coordinates.of(newX, newY);
    }

    @Override
    public int add5AndMultiplyBy3(int number) {
        return multiplyBy3.apply(add5.apply(number));
    }

    @Override
    public int multiplyBy3AndAdd5(int number) {
        return add5.apply(multiplyBy3.apply(number));
    }

    @Override
    public String addAnSheepTo(String sheepAsText) {
        int sheep;
        try {
            sheep = parseSheepIn(sheepAsText);
        } catch (Exception exception) {
            return "You know nothing, John Snow";
        }
        return format("%s sheep", sheep + 1);
    }

    @Override
    Collection<Integer> countOccurrences(char characterToCount, Collection<String> words) {
        return words.stream()
            .map(word -> countOccurrences(characterToCount, word))
            .collect(toList());
    }

    @Override
    <V, R> Collection<R> compute(Function<V, R> function, Collection<V> values) {
        Map<V, R> cache = newHashMap();
        Function<V, R> cachedFunction = value -> {
            if (!cache.containsKey(value)) {
                cache.put(value, function.apply(value));
            }
            return cache.get(value);
        };
        return values.stream()
            .map(cachedFunction)
            .collect(toList());
    }

}
