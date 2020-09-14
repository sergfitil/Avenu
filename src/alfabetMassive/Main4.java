package alfabetMassive;

public class Main4 {
    public static void main(String[] args) {
        //не знаем что лежит
        int[] numbers= new int[5];
        int value = 0;
        //заполняет массив
        for (int i = 0; i<numbers.length; i++) {
            numbers[i] = value;
            value = value + 2;
        }
        //печатает содержимое массива
        for (int i = 0; i<numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
