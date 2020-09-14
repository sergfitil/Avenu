package collection2;

import java.util.Objects;

public class Coin implements Comparable<Coin> {
    private String metal;
    private int year;
    private int nominal;
    private double diametr;

    public Coin(String metal, int year, int nominal, double diametr) {
        this.metal = metal;
        this.year = year;
        this.nominal = nominal;
        this.diametr = diametr;
    }

    public Coin() {
    }

    public String getMetal() {
        return metal;
    }

    public void setMetal(String metal) {
        this.metal = metal;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Coin{" +
                "metal='" + metal + '\'' +
                ", year=" + year +
                ", nominal=" + nominal +
                ", diametr=" + diametr +
                '}';
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public double getDiametr() {
        return diametr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coin coin = (Coin) o;
        return year == coin.year &&
                nominal == coin.nominal &&
                Double.compare(coin.diametr, diametr) == 0 &&
                Objects.equals(metal, coin.metal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metal, year, nominal, diametr);
    }

    public void setDiametr(double diametr) {
        this.diametr = diametr;
    }

    @Override
    public int compareTo(Coin o) {
        if (this.getYear() != o.getYear()) {
            return this.getYear() - o.getYear();
        }
        if (this.getNominal() != o.getNominal()) {
            return this.getNominal() - o.getNominal();
        }

        if (this.getDiametr() != o.getDiametr()) {
            return Double.compare(this.getDiametr(),o.getDiametr());
        }
        return this.getMetal().compareTo(o.getMetal());
    }
}
