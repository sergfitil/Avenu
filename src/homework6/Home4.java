package homework6;

public class Home4 {
    public static void main(String[] args) {
        double a = 5;
        double b = 3;
        double c = 8;
        double p = (a + b + c) / 2;
        double areaTriangle = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println(areaTriangle);
    }

}
