package lessen1;

public class Triangle {
    public static void main(String[] args) {
        int a = 9;
        int b = 3;
        int c = 9;
        double p = 0.5 * (a + b + c);
        double d = p - a;
        double e = p - b;
        double g = p - c;
        double areaTriangle = p * d * c * g;
        System.out.println(areaTriangle);
        int trianglePerimetr = a + b + c;
        System.out.println(trianglePerimetr);

    }
}
