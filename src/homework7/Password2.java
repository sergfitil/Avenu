package homework7;

import java.util.Scanner;

public class Password2 {
    public static void main(String[] args) {
        System.out.println(" Придумайте пароль, пароль должен быть не менее 8 символов, и иметь не менее одной строчной буквы");
        Scanner scanner = new Scanner(System.in);
        String inpudPassword = scanner.nextLine();
        int dlinaPassword = inpudPassword.length();
        if (dlinaPassword > 7) {
        }else{
            System.out.println("пароль должен быть не менее 8 символов");
            if (inpudPassword.matches("[a-zA-Z]")){
                System.out.println("пароль принят");
            }else {
                System.out.println("Пароль должен иметь не менее одной строчной буквы");
            }

        }

    }
}

