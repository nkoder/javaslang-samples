package pl.nkoder.tutorials.javaslang;

import pl.nkoder.tutorials.javaslang.helpers.Coordinates;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import static com.google.common.collect.Lists.newArrayList;
import static java.lang.Integer.parseInt;

abstract class Samples {

    abstract Coordinates rotateClockwiseAndMultiplyBy10(Coordinates originalCoordinates);

    abstract int add5AndMultiplyBy3(int number);

    abstract int multiplyBy3AndAdd5(int number);

    abstract String addAnSheepTo(String sheepAsText);

    abstract Iterable<Integer> countOccurrences(char characterToCount, Iterable<String> words);

    abstract <V, R> Iterable<R> compute(Function<V, R> function, Iterable<V> values);

    abstract Iterable<Integer> validIntegersFrom(Iterable<String> numbersAsText);

    // TODO clean-up
    int parseSheepIn(String sheepAsText) {
        String[] tokens = sheepAsText.split(" ");
        if (tokens.length != 2 || !"sheep".equals(tokens[1])) {
            throw new IllegalArgumentException("Text representation of sheep should have 2 words: number of sheep followed by 'sheep'");
        }
        Integer sheep = parseInt(tokens[0]);
        if (sheep < 0) {
            throw new IllegalArgumentException("Number of sheep has to be positive");
        }
        return sheep;
    }

    // TODO clean-up
    int countOccurrences(char characterToCount, String word) {
        int occurrences = 0;
        for (int index = 0; index < word.length(); index++) {
            if (word.charAt(index) == characterToCount) {
                occurrences++;
            }
        }
        return occurrences;
    }

    // TODO clean-up
    Iterable<Optional<Integer>> asOptionalIntegers(Iterable<String> integersAsText) {
        List<Optional<Integer>> result = newArrayList();
        for (String integerAsText : integersAsText) {
            Optional<Integer> optionalInteger;
            try {
                optionalInteger = Optional.of(parseInt(integerAsText));
            } catch (NumberFormatException exception) {
                optionalInteger = Optional.empty();
            }
            result.add(optionalInteger);
        }
        return result;
    }
}
