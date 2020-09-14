package lessen15;

public class Main {
    public static void main(String[] args) {
        Cirkle cirkle = new Cirkle(5);
        System.out.println(cirkle.perimetrCirkle());
        Ellipse ellipse = new Ellipse(7, 9);
        System.out.println(ellipse.perimetrEllipse());
        Cirkle cirkle1 = new Cirkle(4);
        Cirkle cirkle2 = new Cirkle(4);
        System.out.println(cirkle1.equals(cirkle2));
        Ellipse ellipse1=new Ellipse(5,7);
        Ellipse ellipse2=new Ellipse(5,9);
        System.out.println(ellipse1.equals(ellipse2));
    }
}
