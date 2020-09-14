package lessen5;

public class Main6 {
    public static void main(String[] args) {
        String text = "Привет";

        for (int i = 0 ; i<text.length() ; i++){
            if (text.charAt(i)=='а'|| text.charAt(i)=='е'|| text.charAt(i)=='о'||text.charAt(i)=='у'||text.charAt(i)=='и'||
                    text.charAt(i)=='я'||text.charAt(i)=='э'|| text.charAt(i)=='ю'|| text.charAt(i)=='ы'){
                System.out.println(text.charAt(i));
            }


        }
    }
}
