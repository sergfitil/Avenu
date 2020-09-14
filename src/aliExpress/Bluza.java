package aliExpress;

import java.util.Objects;

public class Bluza  {
    private String name;
    private String specification;

    public Bluza() {
    }

    public Bluza(String name, String specification) {
        this.name = name;
        this.specification = specification;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecification() {
        return specification;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bluza)) return false;
        Bluza bluza = (Bluza) o;
        return Objects.equals(getName(), bluza.getName()) &&
                Objects.equals(getSpecification(), bluza.getSpecification());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSpecification());
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    @Override
    public String toString() {
        return "Характеристика : "  +
                "Блузка женская '" + name + '\'' +
                ", Описание :" + specification + '\'' ;
    }
}
