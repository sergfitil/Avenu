package lessen4;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        System.out.println("придумайте пароль");
        Scanner scanner = new Scanner(System.in);
        String inpudPassword = scanner.nextLine();

        int dlinaPassword = inpudPassword.length();
        if (dlinaPassword > 7) {
            System.out.println("нам подходит");
        } else {
            System.out.println("пароль  короткий");
        }

    }
}
