package structura;

public class Circle implements Figura,Tovar{
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double perimetr() {
        return 2 * 3.14 * radius;
    }

    @Override
    public double area() {
        return 3.14 * radius * radius;
    }

    @Override
    public void by() {
        System.out.println("Товар продан");
    }
}
