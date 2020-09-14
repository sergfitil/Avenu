package lessen5;

public class Main7 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            String carrentNumber = i + "";
            if (carrentNumber.contains("5")) {
                System.out.println(i);
            }
        }
    }
}
