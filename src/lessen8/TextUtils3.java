package lesson7;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextUtils3 {
    public static void main(String[] args) {

        countWordsInLine();
        //printSimilarLetters();

    }




    public static String deleteAllBreaks(String text) {
        String withoutZapyataya = text.replace(',', ' ');
        String withoutPoint = withoutZapyataya.replace('.', ' ');
        String withoutZnak = withoutPoint.replace('!', ' ');
        String withoutDefis = withoutZnak.replace('-', ' ');


        return withoutDefis;

    }


    public static String reverseText(String text) {
        return new StringBuffer(text).reverse().toString();

    }

    public static void printVowels(){
        Scanner inputText = new Scanner(System.in);
        System.out.println("Метод считает сумму гласных букв: ");
        System.out.println("Введите текст:");
        String unputText = inputText.nextLine();

        StringBuilder vowelsFromInputText = new StringBuilder();

        for (int i = 0; i < unputText.length(); i++) {
            if ("АЕЁИОУЫЭЮЯаоэеиыуёюя".indexOf(unputText.charAt(i)) > -1) {
                vowelsFromInputText.append(unputText.charAt(i));
            }
        }
        System.out.println(vowelsFromInputText);
        System.out.println(unputText + " Сумма = " + vowelsFromInputText.length());
    }


    public static void wordsInNewLine(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Метод переводит слово в предл на новую строку:");
        String text  = sc.nextLine();
        System.out.println(text.replaceAll( " ","\n"));


    }




    public static void printSimilarLetters(){

        System.out.println("Введите первый текст: ");
        Scanner sc = new Scanner(System.in);
        String text1 = sc.nextLine();
        System.out.println("Введите второй текст: ");
        String text2 = sc.nextLine();
        String alphabet = "абвгдежзиклмнопрстуфхцчщьшэюяabcdefghijklmnopqrstvwxyz";
        System.out.println("Символы в обоих текстах: ");
        for (int i = 0; i < text1.length(); i++) {
            Character chars1 = text1.charAt(i);
            for (int j = 0; j < text2.length(); j++) {
                Character chars2 = text2.charAt(j);
                for (int k = 0; k < alphabet.length(); k++) {


                    if (chars1 == alphabet.charAt(k) && chars2 == alphabet.charAt(k)) {
                        System.out.println(chars1);
                    }
                }
            }
        }
    }







    public static void countWordsInLine (){
        System.out.println("Введите текст: ");
        Scanner sc = new Scanner (System.in);
        String str = sc.nextLine();
        Pattern vocals = Pattern.compile(" ");

        Matcher m = vocals.matcher(str);
        int vocalCounter = 1;
        while (m.find()) {
            vocalCounter++;
        }
        System.out.println("Количество слов в тексте: " + vocalCounter);

    }
}
