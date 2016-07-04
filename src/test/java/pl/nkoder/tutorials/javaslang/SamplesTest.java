package pl.nkoder.tutorials.javaslang;

import org.junit.Test;
import pl.nkoder.tutorials.javaslang.helpers.Coordinates;

import static org.assertj.core.api.Assertions.assertThat;

public abstract class SamplesTest {

    private final Samples samples = newSamples();

    abstract Samples newSamples();

    @Test
    public void test_for_sample_with_tuples() throws Exception {
        assertThat(samples.rotateClockwiseAndMultiplyBy10(Coordinates.of(0, 0))).isEqualTo(Coordinates.of(0, 0));
        assertThat(samples.rotateClockwiseAndMultiplyBy10(Coordinates.of(2, 3))).isEqualTo(Coordinates.of(30, -20));
        assertThat(samples.rotateClockwiseAndMultiplyBy10(Coordinates.of(3, -2))).isEqualTo(Coordinates.of(-20, -30));
        assertThat(samples.rotateClockwiseAndMultiplyBy10(Coordinates.of(-2, -3))).isEqualTo(Coordinates.of(-30, 20));
        assertThat(samples.rotateClockwiseAndMultiplyBy10(Coordinates.of(-3, 2))).isEqualTo(Coordinates.of(20, 30));
    }
}
