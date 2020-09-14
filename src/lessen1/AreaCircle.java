package lessen1;
import java.lang.Math;
public class AreaCircle {
    public static void main(String[] args) {
        double d = 4.88;
        double r = d / 2;
        double r2 = r * r;
        double p = Math.PI;
        double areaCircle = p * r2;
        System.out.println(areaCircle);
        double circlePerimeter = p * d;
        System.out.println(circlePerimeter);
    }
}
