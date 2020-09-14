package lessen12;

public class Main {
    public static void main(String[] args) {
        Lion lion1 = new Lion();
        Lion lion2 = new Lion();
        Lion lion3 = new Lion();

        Slon slon1 = new Slon();
        Slon slon2 = new Slon();
        Slon slon3 = new Slon();


        Animal[] animals = new Animal[6];
        animals[0] = slon1;
        animals[1] = slon2;
        animals[2] = slon3;
        animals[3] = lion1;
        animals[4] = lion2;
        animals[5] = lion3;
        for (Animal an : animals) {
            an.voice();// полиморфизм
        }

    }
}
