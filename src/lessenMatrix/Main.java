package lessenMatrix;

import matrix.IMatrix;

public class Main {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(4, 4);
        System.out.println(matrix.getRows());
        System.out.println(matrix.getColumns());
        matrix.setValueAt(0, 0, 4);
        matrix.setValueAt(0, 1, 4);
        matrix.setValueAt(0, 2, 3);
        matrix.setValueAt(0, 3, 7);
        matrix.setValueAt(1, 0, 2);
        matrix.setValueAt(1, 1, 4);
        matrix.setValueAt(1, 2, 6);
        matrix.setValueAt(1, 3, 7);
        matrix.setValueAt(2, 0, 5);
        matrix.setValueAt(2, 1, 6);
        matrix.setValueAt(2, 2, 3);
        matrix.setValueAt(2, 3, 9);
        matrix.setValueAt(3, 0, 7);
        matrix.setValueAt(3, 1, 9);
        matrix.setValueAt(3, 2, 3);
        matrix.setValueAt(3, 3, 5);
        System.out.println(matrix.isNullMatrix());
        System.out.println(matrix.getValueAt(3, 3));
        matrix.setValueAt(3, 3, 3);
        matrix.fillMatrix(7);
        matrix.printToConsole();
        System.out.println(matrix.isSquareMatrix());
        double[][] num1 = {{4, 4, 3, 7},
                           {2, 4, 6, 7},
                           {5, 6, 3, 9},
                           {7, 9, 3, 5}};
        Matrix matrix1 = new Matrix(num1);
        double[][] num2 = {{5, 5, 4, 8},
                           {3, 3, 7, 8},
                           {6, 5, 7, 10},
                           {1, 10, 2, 1}};
        Matrix matrix2 = new Matrix(num2);
        IMatrix resultatAdd = matrix1.add(matrix2);
        resultatAdd.printToConsole();
        IMatrix resultatSub = matrix1.sub(matrix2);
        resultatSub.printToConsole();
        IMatrix resultatMull =matrix1.mul(matrix2);
        resultatMull.printToConsole();

    }
}
