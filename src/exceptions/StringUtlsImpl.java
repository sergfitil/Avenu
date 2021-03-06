package exceptions;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtlsImpl implements StringUtils {
    @Override
    public double div(String number1, String number2) throws NullPointerException, NumberFormatException, ArithmeticException {
        if (number1 == null || number2 == null) {
            throw new NullPointerException("Один из аргументов пуст");
        }
        int num1 = 0;
        try {
            num1 = Integer.parseInt(number1);

        } catch (NumberFormatException e) {
            throw new NumberFormatException("Первое значение не число");
        }
        int num2 = 0;
        try {
            num2 = Integer.parseInt(number2);

        } catch (NumberFormatException e) {
            throw new NumberFormatException("Второе значение не число");
        }
        if (num2 == 0) {
            throw new ArithmeticException("Делить на ноль нельзя");

        }

        return num1 / num2;
    }

    @Override
    public int[] findWord(String text, String word) throws NullPointerException {
//        int index=0;
//        if (text == null || word == null) {
//            throw new NullPointerException("Один из аргументов пуст");
//        }
//        for (int i = 0; i < text.length(); i++) {
//            if (text[i].equals(word)) {
//                index=i;
//            }
//        }
        return new int[0];
    }

    @Override
    public double[] findNumbers(String text) throws CustomException {
        Pattern p = Pattern.compile("(\\d+(?:\\.\\d+))");
        Matcher m = p.matcher(text);
        if(!m.find()){
            throw new CustomException("Чисел не найдено");
        }

        while(m.find()) {
            double d = Double.parseDouble(m.group(1));
            System.out.println(d);
        }
        return new double[0];
    }

}
