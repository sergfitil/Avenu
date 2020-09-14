package lessen13;

public abstract class ZooAnimal {
    private String name;

    public ZooAnimal(String name) {
        this.name = name;
    }

    public ZooAnimal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract void voice();

}
