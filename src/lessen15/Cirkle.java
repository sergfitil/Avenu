package lessen15;

import java.util.Objects;

public class Cirkle {
    protected double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Cirkle(double radius) {
        this.radius = radius;
    }

    public Cirkle() {
    }

    public double perimetrCirkle() {
        return 2 * Math.PI * radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cirkle)) return false;
        Cirkle cirkle = (Cirkle) o;
        return Double.compare(cirkle.getRadius(), getRadius()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRadius());
    }
}
