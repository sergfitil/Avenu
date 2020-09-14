package homework8;

public class Figura {
    private double aStorona;
    private double bStorona;
    private double cStorona;
    private double dStorona;

    public double getaStorona() {
        return aStorona;
    }

    public void setaStorona(double aStorona) {
        this.aStorona = aStorona;
    }

    public double getbStorona() {
        return bStorona;
    }

    public void setbStorona(double bStorona) {
        this.bStorona = bStorona;
    }

    public double getcStorona() {
        return cStorona;
    }

    public void setcStorona(double cStorona) {
        this.cStorona = cStorona;
    }

    public double getdStorona() {
        return dStorona;
    }

    public void setdStorona(double dStorona) {
        this.dStorona = dStorona;
    }


    public double areaTriangle() {
        double p = (aStorona + bStorona + cStorona) / 2;
        double area = Math.sqrt(p * (p - aStorona) * (p - bStorona) * (p - cStorona));
        return area;
    }

    public double perimetrTriangle() {
        double perimetr = (aStorona + bStorona + cStorona);
        return perimetr;
    }

    public double areaRectangle() {
        double s = aStorona + bStorona;
        return s;
    }

    public double perimetrRectangle() {
        double p = (aStorona + bStorona) * 2;
        return p;
    }

    public double perimetrSquare() {
        double result = aStorona * 4;
        return result;
    }

    public double areaSquare() {
        double area = aStorona * aStorona;
        return area;
    }
}
