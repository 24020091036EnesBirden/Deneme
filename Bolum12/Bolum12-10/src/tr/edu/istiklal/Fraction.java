package tr.edu.istiklal;

public class Fraction {

    private final int numerator;
    private final int denominator;

    public Fraction(int numerator, int denominator) throws NullDenominatorException {

        if (denominator == 0) {
            throw new NullDenominatorException("Payda 0 olamaz!");
        }

        this.numerator = numerator;
        this.denominator = denominator;
    }

    public String toString() {
        return numerator + "/" + denominator;
    }
}
