package lessen7;

public class FiguraUtils {
    // 1- Модификатор доступа (одно из 4х слов)
    // public - этод метод доступен внутри всего проекта
    // private - этод метод доступен толко внутри этого файла
    // protected - этод метод доступен толко внутри этого файла И ЕГО НАСЛЕДИЯ
    // package - этод метод доступен только внутри данного проекта
    // 2 static есть или нет (разница в вызове)
    // 3 возвращаемый тип(или void,если метод ничего не возвращает)
    // 4 название метода (всегда с маленькой буквы,слитно,максимально понятно)
    // 5 входящие параметры в (), то без чего не возможно выполнить метод
    // 6 тело выполнения метода
    public static int perimetrTreugolnika(int a, int b, int c) {
        int rezult = a + b + c;
        return rezult;

    }

    public static double areaTriangle(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double areaTriangle = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return areaTriangle;
    }

    public static int perimetrKvadrata(int a) {
        int rezult = a * 4;
        return rezult;
    }

    public static int areaKvadrat(int a) {
        int areaKvadrat = a * a;
        return areaKvadrat;
    }

    public static void printTheLessStorona(int a, int b, int c) {
        if (a <= b && a <= c) {
            System.out.println("самая маленькая сторона:" + a);
        }
        if (b <= a && b <= c) {
            System.out.println("самая маленькая сторона:" + b);
        }
        if (c <= b && c <= a) {
            System.out.println("самая маленькая сторона:" + c);
        }
    }

    public static void printAreaCirkle(double d) {
        double r = d / 2;
        double r2 = r * r;
        double p = Math.PI;
        double areaCircle = p * r2;
        System.out.println("Площадь круга:" + areaCircle);
    }

    public static void printCirclePerimetr(double d) {
        double p = Math.PI;
        double circlePerimeter = p * d;
        System.out.println("Периметр круга" + circlePerimeter);
    }

    public static void printRectangleArea(double a, double b) {
        double s = a * b;
        System.out.println("Площадь прямоугольника:" + s);

    }
    public static void printRectanglePerimeter(double a,double b){
        double p = (a+b)*2;
        System.out.println("Периметр прямоугольника:"+p);

    }
}




