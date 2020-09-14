package figura;

public class Ellipse {
    private double a;
    private double b;

    public Ellipse(double a, double b) {
        this.a = a;
        this.b = b;
    }


    public double getA() {
        return this.a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double perimetrEllipse() {
        double perimetr = 4 * (((Math.PI * (a * b)) + (a - b)) / (a + b));
        return perimetr;
    }

    public double areaEllipse() {
        double area = Math.PI * (a * b);
        return area;
    }
}
