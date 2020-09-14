package lessenMatrix;

import matrix.IMatrix;


public class Matrix implements IMatrix {
    private double[][] numbers;

    public Matrix(double[][] numbers) {
        this.numbers = numbers;
    }

    public Matrix() {
    }

    public Matrix(int row, int column) {
        numbers = new double[row][column];
    }


    @Override
    public int getRows() {
        return numbers.length;
    }

    @Override
    public int getColumns() {
        return numbers[0].length;
    }

    @Override
    public double getValueAt(int rowIndex, int colIndex) throws IndexOutOfBoundsException {
        if (rowIndex >= this.getRows()) {
            System.out.println("Задан не подходящий индекс строки!!!");
            return 0.0;
        }

        if (colIndex >= this.getColumns()) {
            System.out.println("Задан не подходящий индекс колонки!!!");
            return 0.0;
        }


        return numbers[rowIndex][colIndex];
    }

    @Override
    public void setValueAt(int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException {
        if (rowIndex >= this.getRows()) {
            System.out.println("Задан не подходящий индекс строки!!!");
            return;
        }
        if (colIndex >= this.getColumns()) {
            System.out.println("Задан не подходящий индекс колонки!!!");
            return;
        }
        numbers[rowIndex][colIndex] = value;
    }


    @Override
    public IMatrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (this.getRows() != otherMatrix.getRows()) {
            System.out.println("Мы можем складывать только матрицы с одинаковым количеством строк");
            return null;
        }
        if (this.getColumns() != otherMatrix.getColumns()) {
            System.out.println("Мы можем складывать только матрицы с одинаковым количеством колонок");
            return null;
        }
        Matrix result = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < result.getRows(); i++) {
            for (int j = 0; j < result.getColumns(); j++) {
                result.setValueAt(i, j, this.getValueAt(i, j) + otherMatrix.getValueAt(i, j));

            }
        }
        return result;


    }


    @Override
    public IMatrix sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (this.getRows()!=otherMatrix.getRows()) {
            System.out.println("Мы можем вычитать только матрицы с одинаковым количеством строк");
            return null;
        }
        if (this.getColumns()!=otherMatrix.getColumns()) {
            System.out.println("Мы можем вычитать только матрицы с одинаковым количеством колонок");
            return null;
        }
        Matrix resultSub= new Matrix(otherMatrix.getRows(),otherMatrix.getColumns());
        for (int i = 0; i < resultSub.getRows(); i++) {
            for (int j = 0; j < resultSub.getColumns(); j++) {
                resultSub.setValueAt(i, j, this.getValueAt(i, j) - otherMatrix.getValueAt(i, j));

            }
        }

        return resultSub;
    }

    @Override
    public IMatrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (this.getRows()!=otherMatrix.getColumns()) {
            System.out.println("Мы можем умножать  только матрицы где строки одной матрицы равны колонкам другой матрицы ");
            return null;
        }
        Matrix resultMul=new Matrix(this.getRows(),this.getColumns());
        for (int i = 0; i < resultMul.getRows(); i++) {
            for (int j = 0; j < resultMul.getColumns(); j++){
                resultMul.setValueAt(i, j, this.getValueAt(i, i) * otherMatrix.getValueAt(j, j));
            }
        }
        return resultMul;
    }

    @Override
    public IMatrix mul(double value) {

        return null;
    }

    @Override
    public IMatrix transpose() {
        return null;
    }

    @Override
    public void fillMatrix(double value) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[0].length; j++) {
               numbers[i][j]=value;
            }
        }
    }

    @Override
    public double determinant() {
        return 0;
    }

    @Override
    public boolean isNullMatrix() {

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[0].length; j++) {
                if (numbers[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }


    @Override
    public boolean isIdentityMatrix() {
        return false;
    }

    @Override
    public boolean isSquareMatrix() {
        if (this.getRows() == this.getColumns()) {
            return true;
        }
        return false;
    }

    @Override
    public void printToConsole() {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[0].length; j++) {
                System.out.print(" " + numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
