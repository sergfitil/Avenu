package lessen12;

public class Main2 {
    public static void main(String[] args) {
        Lion lion1=new Lion();
        Lion lion2=new Lion();
        lion1.setAge(12);
        lion1.setName("Вася");

        lion2.setName("Вася");
        lion2.setAge(12);
        System.out.println(lion1.equals(lion2));
        System.out.println(lion1.toString());
    }
}
