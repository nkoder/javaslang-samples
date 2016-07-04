package pl.nkoder.tutorials.javaslang;

class Java8Samples implements Samples {

    @Override
    public String divideAsInts(String dividendAsText, String divisorAsText) {
        Integer dividend = Integer.valueOf(dividendAsText);
        Integer divisor = Integer.valueOf(divisorAsText);
        try {
            int result = dividend / divisor;
            return String.valueOf(result);
        } catch (ArithmeticException exception) {
            return "n/a";
        }
    }
}
