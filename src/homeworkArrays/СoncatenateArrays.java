package homeworkArrays;

public class СoncatenateArrays {
    public static void main(String[] args) {

        char[] firstData = {'a', 'b', 'c', 'd'};
        char[] secondData = {'q', 'w', 'e', 'r'};
        char[] thirdData = new char[firstData.length + secondData.length];
        for (int i = 0; i < thirdData.length; i++) {
            if (i < firstData.length) {
                thirdData[i] = firstData[i];
            } else {
                thirdData[i] = secondData[i - firstData.length];
            }
            System.out.print(thirdData[i]);
        }


        // for (int i = 0; i < fedya.length; i++) { fedya [i]=(petya.length+vasya.length);
        //    System.out.println(fedya[i]);
    }


}

