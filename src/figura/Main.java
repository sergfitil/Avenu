package figura;

public class Main {
    public static void main(String[] args) {
        FiguraSquare square = new FiguraSquare(5);
        Triangle triangle = new Triangle(5,7,9);
        Rectangle rectangle = new Rectangle(5,7);
        Ellipse ellipse = new Ellipse(5,7);
        System.out.println("Сторона квадрата-"+square.getStorona());
        System.out.println("Площадь квадрата-"+square.areaSquare());
        System.out.println("Периметр квадрата-"+square.perimetrSquare());
        System.out.println("Сторона треугольника a -"+triangle.getA());
        System.out.println("Сторона треугольника b -"+triangle.getB());
        System.out.println("Сторона треугольника c -"+triangle.getC());
        System.out.println("Площадь треугольника - " + triangle.areaTriangle());
        System.out.println("Периметр треугольника - " + triangle.perimetrTriangle());
        System.out.println("Площадь овала -" + ellipse.areaEllipse());
        System.out.println("Периметр овала -" + ellipse.perimetrEllipse());
        System.out.println("Площадь прямоугольника - "+rectangle.areaRectangle());
        System.out.println("Периметр прямоугольника -"+rectangle.perimetrRectangle());
    }

}
