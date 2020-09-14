package lessen2;

public class Main8 {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        int c = 4;
        if (a != b && b != c && a != c) {
            System.out.println("neravnostaronniy");


        }
        if (a == b && b == c && a == c) {
            System.out.println("ravnostoronniy");

        }
        if ((a == c && b != c) || (a == b && b != c)) {
            System.out.println("ravnobedrenniy");

        }

    }
}
