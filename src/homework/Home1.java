package homework;

public class Home1 {
    public static void main(String[] args) {
        int a = 4;
        int b = 3;
        int c = 4;
        if (a < b && a < c)
            System.out.println("a");
        if (b < a && b < c)
            System.out.println("b");
        if (c < a && c < b)
            System.out.println("c");
        if (a==b&&b==c&&c==a)
            System.out.println("ravnostoronniy");
    }
}
