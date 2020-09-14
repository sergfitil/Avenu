package lesson10;

public class Main1 {
    public static void main(String[] args) {
        People vasya = new People();
        People petya = new People();
        vasya.setAge(21);
        petya.setAge(49);

        vasya.setSoname("Sidorov");
        petya.setSoname("Егоров");

        System.out.println(vasya.getSoname());
        System.out.println(petya.getSoname());
        System.out.println(vasya.getAge());
        System.out.println(petya.getAge());
        System.out.println(vasya.printLastLetterSoname());
        System.out.println(petya.printLastLetterSoname());


    }
}
