package pl.nkoder.tutorials.javaslang;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public abstract class SamplesTest {

    abstract Samples newSamples();

    @Test
    public void handling_exceptions() throws Exception {
        // given
        Samples samples = newSamples();

        // when
        assertThat(samples.divideAsInts("7", "2")).isEqualTo("3");
        assertThat(samples.divideAsInts("7", "0")).isEqualTo("n/a");
    }
}
