package homework6;

public class Home2 {
    public static void main(String[] args) {
        int[][] numbers = {{1, 4, 8, 5, 11},
                {2, 5, 7, 4, 7},
                {4, 3, 7, 4, 6},
                {4, 3, 7, 4, 6},
                {10, 2, 4, 3, 9}};
        int indexI = 0;
        int indexJ = numbers[0].length-1;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (indexI == i && indexJ == j) {
                    System.out.print(numbers[j][i] + " ");
                    indexI++;
                    indexJ--;

                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }

    }
}




