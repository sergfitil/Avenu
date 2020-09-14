package quadrilateral;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(5, "green", "wood");
        System.out.println("Сторона квадрата-" + square.getStorona());
        System.out.println("Цвет квадрата-" + square.getColour());
        System.out.println("Квадрат сделан из -" + square.getMaterial());
        Rectangle rectangle = new Rectangle (7, 9,"black","plastic");
        System.out.println("Сторона прямоугольника 1-" + rectangle.getStorona());
        System.out.println("Сторона прямоугольника 2-" + rectangle.getStorona2());
        System.out.println("Цвет прямоугольника-" + rectangle.getColour());
        System.out.println("Прямоугольник сделан из -" + rectangle.getMaterial());
        Parallelogram parallelogram=new Parallelogram(7,8,45,"white","paper");
        System.out.println("Сторона паралелограмма 1-" + parallelogram.getStorona());
        System.out.println("Сторона паралелограмма 2-" + parallelogram.getStorona2());
        System.out.println("Угол паралелограмма -" + parallelogram.getAngle());
        System.out.println("Цвет паралелограмма-" + parallelogram.getColour());
        System.out.println("Паралелограмм сделан из -" + parallelogram.getMaterial());
        Trapezoid trapezoid=new Trapezoid(4,7,4,9,"yellow","titan");
        System.out.println("Сторона трапеции 1-" + trapezoid.getStorona());
        System.out.println("Сторона трапеции 2-" + trapezoid.getStorona2());
        System.out.println("Сторона трапеции 3-" + trapezoid.getStorona3());
        System.out.println("Сторона трапеции 4-" + trapezoid.getStorona4());
        System.out.println("Цвет трапеции-" + trapezoid.getColour());
        System.out.println("Трапеция сделана из -" + trapezoid.getMaterial());
        Quadrangle quadrangle = new Quadrangle(2,4,6,8,"orange","metal");
        System.out.println("Сторона четырехугольника 1-" + quadrangle.getStorona());
        System.out.println("Сторона четырехугольника 2-" + quadrangle.getStorona2());
        System.out.println("Сторона четырехугольника 3-" + quadrangle.getStorona3());
        System.out.println("Сторона четырехугольника 4-" + quadrangle.getStorona4());
        System.out.println("Цвет четырехугольника-" + quadrangle.getColour());
        System.out.println("Четырехугольник сделан из -" + quadrangle.getMaterial());
    }
}
