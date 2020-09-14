package lessen8;

public class Main1 {
    public static void main(String[] args) {
        double[] numbers1 = {2, 4, 3, 7, 5, 94};
        double[] numbers2 = {7, 44, 3, 2, 8};
        double[] result1 = MassivUtils.addMassives(numbers1, numbers2);
        for (double n:result1)
        System.out.print(n+" ");
    }
}
