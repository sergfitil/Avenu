package lessen4;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        System.out.println("1 - круг");
        System.out.println("2 - квадрат");
        System.out.println("3 - прямоугольник");
        System.out.println("4 - треугольник");
        Scanner scanner = new Scanner(System.in);
        int inpudFigura = scanner.nextInt();
        switch (inpudFigura) {
            case 1:
                System.out.println("Введите радиус");
                double inputRadius = scanner.nextDouble();
                System.out.println("площадь или периметр");
                double inpudAction = scanner.nextDouble();
                if (inpudAction == 1) {
                    double ploshad = 3.14 * (inputRadius * inputRadius);
                    System.out.println("Площадь круга =" + ploshad);
                } else {
                    double perimetr = 2 * 3.14 * inputRadius;
                    System.out.println("Периметр круга = " + perimetr);
                }
                break;
            case 2:
                System.out.println("Введите длинну стороны");
                double inpudDlina = scanner.nextDouble();
                System.out.println("Площадь или периметр");
                double inpudZnach = scanner.nextDouble();
                if (inpudZnach == 1) {
                    double ploshad = inpudZnach * 4;
                    System.out.println("Площадь квадрата = " + ploshad);
                } else {
                    double perimetr = inpudZnach * inpudZnach;
                    System.out.println("Периметр квадрата =" + perimetr);
                }
                break;
            case 3:
                System.out.println("Введите длинну a");
                double a = scanner.nextDouble();
                System.out.println("Введите длинну b");
                double b = scanner.nextDouble();
                System.out.println("Площадь или Периметр");
                double inpudZnak = scanner.nextDouble();
                if (inpudZnak == 1) {
                    double plochad = a * b;
                    System.out.println("Площадь прямоугольника =" + plochad);
                } else {
                    double perimetr = 2 * (a + b);
                    System.out.println("Периметр прямоугольника =" + perimetr);
                }
                break;
            case 4:
                System.out.println("Введите длинну q");
                double q = scanner.nextDouble();
                System.out.println("Введите длинну w");
                double w = scanner.nextDouble();
                System.out.println("Введите длинну e");
                double e = scanner.nextDouble();
                double p = (q + w + e) / 2;
                System.out.println("Площадь или Периметр ");
                double znak = scanner.nextDouble();
                if (znak == 1) {
                    double plochad = Math.sqrt(p * (p - q) * (p - w) * (p - e));
                    System.out.println("Площадь треугольника =" + plochad);
                } else {
                    double perimetr = q + w + e;
                    System.out.println("Периметр треугольника ="+ perimetr);

                }

                break;// почему inpudZnak нельзя повторить, а plochad и  perimetr можно?
            default:
                System.out.println("у нас нет такой фигуры ");


        }
    }
}
