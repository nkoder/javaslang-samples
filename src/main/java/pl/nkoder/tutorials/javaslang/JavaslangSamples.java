package pl.nkoder.tutorials.javaslang;

import javaslang.control.Try;

class JavaslangSamples implements Samples {

    @Override
    public String divideAsInts(String dividendAsText, String divisorAsText) {
        Integer dividend = Integer.valueOf(dividendAsText);
        Integer divisor = Integer.valueOf(divisorAsText);
        return Try.of(() -> dividend / divisor)
            .map(result -> String.valueOf(result))
            .recover(exception -> "n/a")
            .get();
    }
}
