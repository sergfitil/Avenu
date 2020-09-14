package lesssen9;

import java.util.Scanner;

public class TextUtils {

    public static void printCommonChars(String text, String otherText) {
        char[] charsFromText = text.toCharArray();
        for (char ch : charsFromText) {
            if (otherText.contains(ch + "")) {
                System.out.print(ch);

            }

        }
        System.out.println();
    }

    public static void printSummWordText(String text) {
        String[] words = text.split(" ");
        System.out.println(words.length);

    }
    public static void checkPassword (){
        System.out.println(" Придумайте пароль, пароль должен быть не менее 8 символов,иметь цифры, и иметь не менее одной заглавной буквы");
        Scanner scanner = new Scanner(System.in);

        String inpudPassword = scanner.nextLine();
        if (inpudPassword.matches("[0-9a-zA-Z]{8,}")){
            System.out.println("Пароль принят");
        }else {
            System.out.println("пароль должен быть не менее 8 символов,иметь цифры, и иметь не менее одной заглавной буквы");
        }

    }

}


