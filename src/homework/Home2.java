package homework;

public class Home2 {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int c = 4;
        int d = 2;
        if (a == b && b == c && c == d)
            System.out.println("kvadrat");
        if ((a == b && a != c && c == d && d != b)
                || (b == c && c != d && a == d && d != b)
                || (a == c && b == d && a != b && c != d))
            System.out.println("pryamouugolnik");
        if ((a == b && a == c && d != a)
                || (b == a && b == c && b != d)
                || (c == b && c == d && c != a)
                || (d == a && d == b && d != c))
            System.out.println("trapezoid");
        if (a != b && b != c && c != d && d != a && c != a && b != d)
            System.out.println("chetyrehugolnik");
        if ((a == b && a != c && a != d && d != c)
                || (b == c && b != a && b != d && d != a)
                || (a == c && a != b && a != d && d != c)
                || (d == a && d != c && d != b && b != c)
                || (d == b && d != c && d != a && a != c)
                || (b == c && b != a && b != d && a != d))
            System.out.println("paralelogramm");


    }

}


