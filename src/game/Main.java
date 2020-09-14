package game;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        Diller diller = new Diller();
        Game game =new Game();
        game.addPlayerToGame(player);
        game.addPlayerToGame(diller);
        Koloda koloda=new Koloda();
        System.out.println(koloda.getRandomCard());
    }
}
