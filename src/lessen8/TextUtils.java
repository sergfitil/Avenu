package lessen8;

public class TextUtils {
    public static String deleteAllBreaks(String text) {
        String withoutZaptataya = text.replace(',', ' ');
        String withoutPoint = withoutZaptataya.replace('.', ' ');
        String withoutDefis = withoutPoint.replace('-', ' ');
        return withoutDefis;
    }

    public static String reverseText(String text) {
        return new StringBuilder(text).reverse().toString();
    }

    public static int summaGlasnih(String text) {
        int itog = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'а'
                    || text.charAt(i) == 'е'
                    || text.charAt(i) == 'и'
                    || text.charAt(i) == 'о'
                    || text.charAt(i) == 'у'
                    || text.charAt(i) == 'ы'
                    || text.charAt(i) == 'э'
                    || text.charAt(i) == 'ю'
                    || text.charAt(i) == 'я') {
                itog = (itog + 1);

            }

        }
        return itog;

    }

    public static void typeWordsSeparately(String text) {
        System.out.print(text.replaceAll("\\s+", "\n"));
        System.out.println();

    }

    public static void commonLetters(String text1, String text2) {

        for (int i = 0; i < text1.length(); i++) {
            char simbols = text1.charAt(i);
            for (int j = 0; j < text2.length(); j++) {

                char simbols2 = text2.charAt(j);
                if (simbols == simbols2) {

                    System.out.print(simbols);
                } else {
                    System.out.print("");

                }
            }

        }
        System.out.println();

    }

    public static int wordСount(String text) {
        int itog = 1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                itog = (itog + 1);
            }

        }
        return itog;
    }
}