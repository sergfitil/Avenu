package lessen15;

import java.util.Objects;

public class Ellipse extends Cirkle {
    private double radius2;

    public Ellipse() {
    }

    public Ellipse(double radius, double radius2) {
        super(radius);
        this.radius2 = radius2;
    }


    public double perimetrEllipse() {
        double perimetrEllipse = 4 * (((Math.PI * (radius * radius2)) + (radius - radius2)) / (radius + radius2));
        return perimetrEllipse;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ellipse)) return false;
        if (!super.equals(o)) return false;
        Ellipse ellipse = (Ellipse) o;
        return Double.compare(ellipse.radius2, radius2) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), radius2);
    }
}
