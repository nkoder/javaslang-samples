package pl.nkoder.tutorials.javaslang;

import pl.nkoder.tutorials.javaslang.helpers.Coordinates;

abstract class Samples {

    abstract Coordinates rotateClockwiseAndMultiplyBy10(Coordinates originalCoordinates);

    abstract int add5AndMultiplyBy3(int number);

    abstract int multiplyBy3AndAdd5(int number);

    abstract String addAnSheepTo(String sheepAsText);

    int parseSheepIn(String sheepAsText) {
        String[] tokens = sheepAsText.split(" ");
        if (tokens.length != 2 || !"sheep".equals(tokens[1])) {
            throw new IllegalArgumentException("Text representation of sheep should have 2 words: number of sheep gollowed by 'sheep'");
        }
        Integer sheep = Integer.valueOf(tokens[0]);
        if (sheep < 0) {
            throw new IllegalArgumentException("Number of sheep has to be positive");
        }
        return sheep;
    }
}
