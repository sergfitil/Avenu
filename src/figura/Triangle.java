package figura;

public class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public double getB() {
        return this.b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public double getC() {
        return this.c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public double areaTriangle() {
        double p = (a + b + c) / 2;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return area;
    }

    public double perimetrTriangle() {
        double perimetr = (a + b + c);
        return perimetr;
    }
}
