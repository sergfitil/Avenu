package alfabetMassive;

public class Main2 {
    public static void main(String[] args) {
        String text = "Я люблю людей".toLowerCase();
        String alfabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        for (int i = 0; i < alfabet.length(); i++) {
            int count = 0;
            char curentCharFromAlfabet = alfabet.charAt(i);// 1 круг  - а ,2 круг -б и т.д.
            for (int j = 0; j < text.length(); j++) {
                char curentCharFromText = text.charAt(j);
                if (curentCharFromText == curentCharFromAlfabet) {
                    count++;
                }
            }
            System.out.println(curentCharFromAlfabet + "-" + count);
        }
    }
}
