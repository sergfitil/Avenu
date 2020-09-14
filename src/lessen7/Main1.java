package lessen7;

public class Main1 {
    public static void main(String[] args) {
        int[] firstData = {12, 4, 4, 23, 5, 7};
        int secondData = firstData[0];
        for (int i = 0; i < firstData.length; i++) {
            if (i != firstData.length - 1) {
                firstData[i] = firstData[i + 1];

            } else {
                firstData[i] = secondData;
            }

        }//стандартный проход по любому хранилищ данных
        for (int i = 0; i < firstData.length; i++) {
            System.out.println(firstData[i]);
        }//for each
        for (int n:firstData){
            System.out.println(n);
        }
    }
}
