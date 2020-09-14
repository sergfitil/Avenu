package collection2;



import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Coin> coins = new TreeSet<>();
        coins.add(new Coin("Золото", 1990, 10, 2));
        coins.add(new Coin("Золото", 1991, 10, 2));
        coins.add(new Coin("Бронза", 1991, 10, 2));
        coins.add(new Coin("Медь", 1990, 5, 2));
        for (Coin coin : coins) {
            System.out.println(coin);
        }


    }
}
