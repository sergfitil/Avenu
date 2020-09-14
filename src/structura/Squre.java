package structura;

public class Squre implements Figura, Tovar {
    private int a;

    public Squre() {
    }

    @Override
    public double perimetr() {
        return a * 4;
    }

    public Squre(int a) {
        this.a = a;
    }

    @Override
    public double area() {
        return a * a;
    }

    @Override
    public void by() {

    }
}
