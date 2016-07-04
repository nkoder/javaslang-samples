package pl.nkoder.tutorials.javaslang;

import org.junit.Test;
import pl.nkoder.tutorials.javaslang.helpers.Coordinates;

import java.util.Collection;

import static com.google.common.collect.Lists.newArrayList;
import static org.assertj.core.api.Assertions.assertThat;

public abstract class SamplesTest {

    private final Samples samples = newSamples();

    abstract Samples newSamples();

    @Test
    public void test_for_tuples_sample() throws Exception {
        assertThat(samples.rotateClockwiseAndMultiplyBy10(Coordinates.of(0, 0))).isEqualTo(Coordinates.of(0, 0));
        assertThat(samples.rotateClockwiseAndMultiplyBy10(Coordinates.of(2, 3))).isEqualTo(Coordinates.of(30, -20));
        assertThat(samples.rotateClockwiseAndMultiplyBy10(Coordinates.of(3, -2))).isEqualTo(Coordinates.of(-20, -30));
        assertThat(samples.rotateClockwiseAndMultiplyBy10(Coordinates.of(-2, -3))).isEqualTo(Coordinates.of(-30, 20));
        assertThat(samples.rotateClockwiseAndMultiplyBy10(Coordinates.of(-3, 2))).isEqualTo(Coordinates.of(20, 30));
    }

    @Test
    public void test_for_function_composition_sample() throws Exception {
        assertThat(samples.add5AndMultiplyBy3(2)).isEqualTo(21);
        assertThat(samples.multiplyBy3AndAdd5(2)).isEqualTo(11);
    }

    @Test
    public void test_for_function_lifting_sample() throws Exception {
        assertThat(samples.addAnSheepTo("0 sheep")).isEqualTo("1 sheep");
        assertThat(samples.addAnSheepTo("1 sheep")).isEqualTo("2 sheep");
        assertThat(samples.addAnSheepTo("9 sheep")).isEqualTo("10 sheep");
        assertThat(samples.addAnSheepTo("1 cat")).isEqualTo("You know nothing, John Snow");
        assertThat(samples.addAnSheepTo("-1 sheep")).isEqualTo("You know nothing, John Snow");
    }

    @Test
    public void test_for_function_currying_sample() throws Exception {
        Collection<String> words = newArrayList("cat", "dog", "chinchilla");

        assertThat(samples.countOccurrences('c', words)).containsExactly(1, 0, 2);
    }
}
