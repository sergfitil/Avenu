package homework4;

public class Home2 {
    public static void main(String[] args) {
        String text = "12345";
        for (int i = 0; i < text.length(); i++) {
            String odd = i + "";
            if (i == 0) {
                System.out.println(text.charAt(i));
                System.out.println(text.charAt(i)+"2");
                System.out.println(text.charAt(i)+"2"+"3");
                System.out.println(text.charAt(i)+"2"+"3"+"4");
                System.out.println(text.charAt(i)+"2"+"3"+"4"+"5");

            }

        }
    }
}
