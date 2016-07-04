package pl.nkoder.tutorials.javaslang;

import javaslang.Tuple;
import pl.nkoder.tutorials.javaslang.helpers.Coordinates;

class JavaslangSamples implements Samples {

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

}
