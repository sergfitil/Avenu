package homework4;

public class Home1 {
    public static void main(String[] args) {
        for (int i = 10; i <= 100; i = i + 2) {
            String oddNumber = i + "";
            if (oddNumber.contains("7")) {
                System.out.println(i);
            }
        }


    }
}
