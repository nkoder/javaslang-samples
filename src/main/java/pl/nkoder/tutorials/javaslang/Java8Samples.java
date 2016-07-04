package pl.nkoder.tutorials.javaslang;

import pl.nkoder.tutorials.javaslang.helpers.Coordinates;

class Java8Samples implements Samples {

    @Override
    public Coordinates rotateClockwiseAndMultiplyBy10(Coordinates originalCoordinates) {
        int newX = 10 * originalCoordinates.y;
        int newY = 10 * -originalCoordinates.x;
        return Coordinates.of(newX, newY);
    }

}
