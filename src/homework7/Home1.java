package homework7;

public class Home1 {
    public static void main(String[] args) {
        String text = "уже прошла половина лета";
        int itog=1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ')
                     {
                itog=(itog+1);
            System.out.print(itog);}



        }
    }

}
