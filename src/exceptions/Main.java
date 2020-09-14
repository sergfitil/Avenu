package exceptions;

public class Main {
    public static void main(String[] args) {
        People people = new People();
        try {
            people.setAge(-200);
        } catch (UnCurrentAgeEception unCurrentAgeEception) {
            System.out.println("Возраст указан не верно");
        }
    }
}
