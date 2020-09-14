package game;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Koloda {
    private ArrayList<Card> cards = new ArrayList<>();

    public Koloda() {
        cards.add(new Card("Двойка треф", 2));
        cards.add(new Card("Двойка червей", 2));
        cards.add(new Card("Двойка бубей", 2));
        cards.add(new Card("Двойка пики", 2));
        cards.add(new Card("Тройка треф", 3));
        cards.add(new Card("Тройка бубей", 3));
        cards.add(new Card("Тройка пики", 3));
        cards.add(new Card("Тройка червей", 3));
        cards.add(new Card("Четверка червей", 4));
        cards.add(new Card("Червека пики", 4));
        cards.add(new Card("Четверка бубей", 4));
        cards.add(new Card("Четверка треф", 4));
        cards.add(new Card("Пятерка червей", 5));
        cards.add(new Card("Пятерка треф", 5));
        cards.add(new Card("Пятерка бубей", 5));
        cards.add(new Card("Пятерка пики", 5));
        cards.add(new Card("Шетерка червей", 6));
        cards.add(new Card("Шестерка треф", 6));
        cards.add(new Card("Шестерка бубей", 6));
        cards.add(new Card("Шестерка пики", 6));
        cards.add(new Card("Семерка червей", 7));
        cards.add(new Card("Семерка треф", 7));
        cards.add(new Card("Семерка бубей", 7));
        cards.add(new Card("Семерка пики", 7));
        cards.add(new Card("Восмьмерка червей", 8));
        cards.add(new Card("Восмьмерка треф", 8));
        cards.add(new Card("Восмьмерка бубей", 8));
        cards.add(new Card("Восмьмерка пики", 8));
        cards.add(new Card("Девятка червей", 9));
        cards.add(new Card("Девятка треф", 9));
        cards.add(new Card("Девятка бубей", 9));
        cards.add(new Card("Девятка пики", 9));
        cards.add(new Card("Десятка червей", 10));
        cards.add(new Card("Десятка треф", 10));
        cards.add(new Card("Десятка бубей", 10));
        cards.add(new Card("Десятка пики", 10));
        cards.add(new Card("Валет червей", 2));
        cards.add(new Card("Валет треф", 2));
        cards.add(new Card("Валет бубей", 2));
        cards.add(new Card("Валет пики", 2));
        cards.add(new Card("Дама червей", 3));
        cards.add(new Card("Дама треф", 3));
        cards.add(new Card("Дама бубей", 3));
        cards.add(new Card("Дама пики", 3));
        cards.add(new Card("Король червей", 4));
        cards.add(new Card("Король треф", 4));
        cards.add(new Card("Король бубей", 4));
        cards.add(new Card("Король пики", 4));
        cards.add(new Card("Туз червей", 11));
        cards.add(new Card("Туз треф", 11));
        cards.add(new Card("Туз бубей", 11));
        cards.add(new Card("Туз пики", 11));
    }

    public Card getRandomCard() {
        int randomNum = ThreadLocalRandom.current().nextInt(0, 51 + 1);
        return cards.get(randomNum);

    }
}
