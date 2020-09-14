package homework6;

public class ForEach {
    public static void main(String[] args) {
        int[][] numbers = {{1, 4, 8, 5, 11},
                {2, 5, 7, 4, 7},
                {4, 3, 7, 4, 6},
                {4, 3, 7, 4, 6},
                {10, 2, 4, 3, 9}};
        for (int[] n:numbers) {
            System.out.println(n);
        }
    }

}
