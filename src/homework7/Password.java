package homework7;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Password {
    public static void main(String[] args) {
        System.out.println(" Придумайте пароль, пароль должен быть не менее 8 символов, и иметь не менее одной строчной буквы");
        Scanner scanner = new Scanner(System.in);
        String inpudPassword = scanner.nextLine();
        if (inpudPassword.matches("[A-Za-z]{8,}")) {
            System.out.println("пароль принят");
        }else{
            System.out.println("пароль должен быть не менее 8 символов, и иметь не менее одной строчной буквы");

        }

    }
}
