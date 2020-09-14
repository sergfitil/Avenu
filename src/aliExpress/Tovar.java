package aliExpress;

import java.util.Arrays;
import java.util.Objects;

public class Tovar {
    private String mainName;
    private Otziv[] otziv = new Otziv[1];
    private double price;

    public Tovar() {
    }

    public Tovar(String mainName, double price) {
        this.mainName = mainName;
        this.price = price;

    }

    public String getMainName() {
        return mainName;
    }

    public void setMainName(String mainName) {
        this.mainName = mainName;
    }

    @Override
    public String toString() {
        return
                "Наименование товара -'" + mainName + '\'' +
                ", Цена товара - " + price
                ;
    }

    public Otziv[] getOtziv() {
        return otziv;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tovar)) return false;
        Tovar tovar = (Tovar) o;
        return Double.compare(tovar.getPrice(), getPrice()) == 0 &&
                Objects.equals(getMainName(), tovar.getMainName()) &&
                Arrays.equals(getOtziv(), tovar.getOtziv());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getMainName(), getPrice());
        result = 31 * result + Arrays.hashCode(getOtziv());
        return result;
    }

    public void setOtziv(Otziv[] otziv) {
        this.otziv = otziv;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
