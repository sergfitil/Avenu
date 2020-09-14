package aliExpress;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        User user = new User("Gosha", "gosha@mail.ru", new Date());
        Otziv otziv = new Otziv(4, new Date(), user, "did not like");
        Otziv otziv2 = new Otziv(5, new Date(), user, "good");
        Tovar tovar = new Tovar("bluza", 3.15);
        Bluza bluza = new Bluza("Летучая мышь", "Женская блузка с v-образным вырезом, свободная верхняя одежда с длинными рукавами");
        System.out.println(tovar);
        System.out.println(bluza);
    }
}
