package lessen7;

public class Main3 {
    public static void main(String[] args) {
      int pTreug = FiguraUtils.perimetrTreugolnika(5,7,9);
        System.out.println(pTreug);
        int pTreug2 = FiguraUtils.perimetrTreugolnika(5,8,7);
        System.out.println(pTreug2);
        FiguraUtils.printTheLessStorona(8,2,3);
        FiguraUtils.printAreaCirkle(4.88);
        double sTreug=  FiguraUtils.areaTriangle(5,3,8);
        System.out.println("Площадь треугольника:"+sTreug);
        int pKvadrat = FiguraUtils.perimetrKvadrata(7);
        System.out.println("Периметр квадрата:"+pKvadrat);
        int sKvadrat = FiguraUtils.areaKvadrat(5);
        System.out.println("Площадь кквадрата:"+sKvadrat);
        FiguraUtils.printAreaCirkle(4.88);
        FiguraUtils.printCirclePerimetr(4.88);
        FiguraUtils.printRectangleArea(8,5);
        FiguraUtils.printRectanglePerimeter(9,6);
    }




}
