package homework8;

public class Main1 {
    public static void main(String[] args) {
        Figura triangle = new Figura();
        Figura rectangle = new Figura();
        Figura square = new Figura();
        triangle.setaStorona(3);
        triangle.setbStorona(7);
        triangle.setcStorona(8);
        System.out.println("Площадь треугольника:" + triangle.areaTriangle());
        System.out.println("Периметр треугольника:" + triangle.perimetrTriangle());
        rectangle.setaStorona(7);
        rectangle.setbStorona(5);
        System.out.println("Периметр прямоугольника:" + rectangle.perimetrRectangle());
        System.out.println("Площадь прямоугольника:" + rectangle.areaRectangle());
        square.setaStorona(7);
        System.out.println("Периметр квадрата:" + square.perimetrSquare());
        System.out.println("Площадь квадрата:" + square.areaSquare());


    }
}
