package igra;

import java.util.Objects;

public class Card {
    private String name;
    private String mast;
    private int value;
    public Card(){
    }

    public Card(String name, String mast, int value) {
        this.name = name;
        this.mast = mast;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getMast() {
        return mast;
    }

    public int getValue() {
        return value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMast(String mast) {
        this.mast = mast;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Card)) return false;
        Card card = (Card) o;
        return getValue() == card.getValue() &&
                Objects.equals(getName(), card.getName()) &&
                Objects.equals(getMast(), card.getMast());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getMast(), getValue());
    }

    @Override
    public String toString() {
        return name+" " + mast;
    }
}
