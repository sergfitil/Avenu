package lessen13;

public class FractionNumberOperationImpl implements FractionNumberOperation {

    @Override
    public FractionNumber add(FractionNumber a, FractionNumber b) throws NullPointerException {
        FractionNumberImpl result = new FractionNumberImpl();
        int commonDivisor = 1;
        for (int i = 1; i <= a.getDivisor() * b.getDivisor(); i++) {
            if (i % a.getDivisor() == 0 && i % b.getDivisor() == 0) {
                commonDivisor = i;
                break;
            }
        }
        result.setDivisor(commonDivisor);
        int commonDividend = ((commonDivisor / a.getDivisor()) * a.getDividend()) + ((commonDivisor / b.getDivisor()) * b.getDividend());
        result.setDividend(commonDividend);
        if (commonDividend % 2 == 0 && commonDivisor % 2 == 0) {
            result.setDividend(result.getDividend() / 2);
            result.setDivisor(result.getDivisor() / 2);

        }

        return result;
    }

    @Override
    public FractionNumber sub(FractionNumber a, FractionNumber b) throws NullPointerException {
        FractionNumberImpl difference = new FractionNumberImpl();
        int commonDivisor = 1;
        for (int i = 1; i <= a.getDivisor() * b.getDivisor(); i++) {
            if (i % a.getDivisor() == 0 && i % b.getDivisor() == 0) {
                commonDivisor = i;
                break;
            }
        }
        difference.setDivisor(commonDivisor);
        int commonDividend = ((commonDivisor / a.getDivisor()) * a.getDividend()) - ((commonDivisor / b.getDivisor()) * b.getDividend());
        difference.setDividend(commonDividend);
        if (commonDividend % 2 == 0 && commonDivisor % 2 == 0) {
            difference.setDividend(difference.getDividend() / 2);
            difference.setDivisor(difference.getDivisor() / 2);
        }

        return difference;
    }

    @Override
    public FractionNumber mul(FractionNumber a, FractionNumber b) throws NullPointerException {
        FractionNumberImpl total = new FractionNumberImpl();
        int commonDividend = a.getDividend() * b.getDividend();
        int commonDivisor = a.getDivisor() * b.getDivisor();
        total.setDividend(commonDividend);
        total.setDivisor(commonDivisor);
        return total;
    }

    @Override
    public FractionNumber div(FractionNumber a, FractionNumber b) throws NullPointerException, ArithmeticException {
        FractionNumberImpl itog = new FractionNumberImpl();
        int commonDividend = a.getDividend() * b.getDivisor();
        int commonDivisor = a.getDivisor() * b.getDividend();
        itog.setDividend(commonDividend);
        itog.setDivisor(commonDivisor);
        return itog;
    }
}
