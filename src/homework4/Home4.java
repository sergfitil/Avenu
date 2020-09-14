package homework4;

public class Home4 {
    public static void main(String[] args) {
        String text = "Я люблю людей";
        for (int i = 0; i < text.length(); i = i + 3) {
            if (text.charAt(i) == 'л' || text.charAt(i) == 'б' || text.charAt(i) == 'д'
                    || text.charAt(i) == 'й' || text.charAt(i) == 'с' || text.charAt(i) == 'т' ||
                    text.charAt(i) == 'п' || text.charAt(i) == 'р') {
                System.out.print(text.charAt(i));
            }


        }
    }
}
// почему когда ставишь != а || !=е и т.д.код считает не правильно?