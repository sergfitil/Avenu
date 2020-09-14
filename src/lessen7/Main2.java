package lessen7;

public class Main2 {
    public static void main(String[] args) {
        int[][] numbers = {{1, 4, 8, 5, 4},
                           {2, 5, 7, 4, 7},
                           {4, 3, 7, 4, 6},
                           {4, 3, 7, 4, 6},
                           {3, 2, 4, 3, 3}};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (i == j) {
                    System.out.print(numbers[i][j] + " ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }

    }
}
