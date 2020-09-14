package lessen1;

public class CylinderVolume {
    public static void main(String[] args) {
        double h = 1.22;
        double d = 4.88;
        double r = d * 0.5;
        double p = 3.14;
        double r2 = r * r;
        double cylinderVolume = p * r2 * h;
        System.out.println(cylinderVolume);
    }
}
