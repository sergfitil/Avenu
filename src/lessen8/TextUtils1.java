package lesson8;

public class TextUtils1 {

    private static boolean correct;

    public static void printCommonChars(String text, String otherText) {
        char[] charsFromText = text.toCharArray();
        for (char ch : charsFromText) {
            if (otherText.contains(ch + "")) {
                System.out.print(ch);
            }
        }
    }

    public static void printSumWordsFromText(String text) {
        String[] words = text.split(" ");
        System.out.println(words.length);
    }


    public static void password(String inputPassword) {
        if (inputPassword.length() > 8) {
            if (inputPassword.matches(".+[0-9].+")) {
                if (inputPassword.matches(".+[a-z].+")) {
                    if (inputPassword.matches(".+[A-Z].+")) {
                        System.out.println("Пароль верный");
                    } else System.out.println("Пароль не содержит заглавную букву");
                } else System.out.println("Пароль не содержит строчную букву");
            } else System.out.println("Пароль не содержит цифру");
        } else System.out.println("Пароль менее 8 символов.");

    }
}



