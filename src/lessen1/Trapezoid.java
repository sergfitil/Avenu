package lessen1;

public class Trapezoid {
    public static void main(String[] args) {
        int a = 10;
        int b = 7;
        int c = 4;
        int d = 5;
        double e = (a + b) * 0.5;
        int c2 = c * c;
        int d2 = d * d;
        int f = a - b;
        int f2 = f * f;
        int g = 2 * f;
        int h = (f2 + c2 - d2) / g;
        int i = h * h;
        int j = c2 - i;
        int q = j / 4;
        double areaTrapezoid = e * q;
        System.out.println(areaTrapezoid);
        int perimetrTrapezoid = a + b + c + d;
        System.out.println(perimetrTrapezoid);


    }
}
