package homework;

public class Home3 {
    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        int c = 5;
        int d = 4;
        if (a == b && a != c && c == d && d != b)
        System.out.println("pryamougolnik");
        if ((a == b && a != d && a != c)
                || (b == c && b != a && b != d)
                || (c == a && c != b && c != d)
                || (d == c && d != a && d != b))
            System.out.println("paralelogramm");
    }
}
