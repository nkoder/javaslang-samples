package pl.nkoder.tutorials.javaslang;

import pl.nkoder.tutorials.javaslang.helpers.Coordinates;

import java.util.function.Function;

import static java.lang.String.format;

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

}
