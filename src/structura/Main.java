package structura;

import lessen15.Cirkle;

public class Main {
    public static void main(String[] args) {
        Circle cirkle1 = new Circle(5);
        Circle cirkle2 = new Circle(5);
        Circle cirkle3 = new Circle(5);

        Squre squre1 = new Squre();
        Squre squre2 = new Squre();
        Squre squre3 = new Squre();

        Figura[] figuras = new Figura[6];
        figuras[0] = squre1;
        figuras[1] = squre2;
        figuras[2] = squre3;
        figuras[3] = cirkle1;
        figuras[4] = cirkle2;
        figuras[5] = cirkle3;
        for(Figura f: figuras){
            f.by();

        }

    }
}
