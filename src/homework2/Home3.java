package homework2;

public class Home3 {
    public static void main(String[] args) {
        double pervoe = 0;
        double vtoroe = 0;
        double tretye = 0;
        double chetvertoe = 0;
        for (double i = 500; i <= 1000; i++) {
            pervoe = i / 7;
            tretye = i / 19;
            if (pervoe % 1 == 0 && tretye % 1 == 0)
                vtoroe = pervoe * 7;
            chetvertoe = tretye * 19;
            System.out.println(vtoroe);



        }

    }
}
