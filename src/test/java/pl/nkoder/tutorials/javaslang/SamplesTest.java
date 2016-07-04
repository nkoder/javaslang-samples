package pl.nkoder.tutorials.javaslang;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SamplesTest {

    @Test
    public void initializes() throws Exception {
        // given
        Samples samples = new Samples();

        // expect
        assertThat(samples).isNotNull();
    }
}