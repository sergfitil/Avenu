package lesson10;

public class Main {
    public static void main(String[] args) {
        Bludo kompot = new Bludo();
        Bludo gulyash = new Bludo();
        kompot.setPrice(15);
        gulyash.setPrice(21);
        System.out.println(kompot.getPrice());
        System.out.println(gulyash.getPrice());

      int p =   kompot.getPrice();
        System.out.println(p);
    }
}
