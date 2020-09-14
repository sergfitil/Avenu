package homework7;

public class Home3 {
    public static void main(String[] args) {
        String text1 = "уже прошла половина лета";
        String text2 = "но остались самые теплые дни";
        for (int i = 0; i < text1.length(); i++) {
            char simbols = text1.charAt(i);
            for (int j = 0; j < text2.length(); j++) {

                char simbols2 = text2.charAt(j);
                if (simbols == simbols2) {

                    System.out.print(simbols );
                } else {
                    System.out.print("");
                }
            }

        }

    }
}
