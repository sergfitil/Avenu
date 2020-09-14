package lessen13;

public class FractionNumberImpl implements FractionNumber {
    private int dividend;
    private int divisor;

    public FractionNumberImpl() {
        this.divisor = FractionNumber.DEFAULT_DIVISOR_VALUE;
    }

    public FractionNumberImpl(int dividend, int divisor) {
        this.dividend = dividend;
        this.divisor = divisor;
    }

    @Override
    public void setDividend(int dividend) {
        this.dividend = dividend;
    }

    @Override
    public int getDividend() {
        return this.dividend;
    }

    @Override
    public void setDivisor(int divisor) throws IllegalArgumentException {
        this.divisor = divisor;
    }

    @Override
    public int getDivisor() {
        return this.divisor;
    }

    @Override
    public double value() {
        return this.dividend / (double) this.divisor;
    }

    @Override
    public String toString() {
        return this.dividend + "/" + this.divisor;
    }
}
