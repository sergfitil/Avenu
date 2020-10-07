package multyMap;

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

        int commonDivident = ((commonDivisor / a.getDivisor()) * a.getDividend())
                + ((commonDivisor / b.getDivisor()) * b.getDividend());
        result.setDividend(commonDivident);

        // 39/36 - написать сокращение кода - результат 13/12


        return result;
    }

    @Override
    public FractionNumber sub(FractionNumber a, FractionNumber b) throws NullPointerException {
        return null;
    }

    @Override
    public FractionNumber mul(FractionNumber a, FractionNumber b) throws NullPointerException {
        return null;
    }

    @Override
    public FractionNumber div(FractionNumber a, FractionNumber b) throws NullPointerException, ArithmeticException {
        return null;
    }
}
