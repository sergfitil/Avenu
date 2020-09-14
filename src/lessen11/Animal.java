package lessen11;

public class Animal {
    private int age;
    private String animal;
    private String name;

    // модификатор доступа
    // название конструктора(название класса)
    public Animal(int age, String animal, String name) {
        this.age = age;
        this.animal = animal;
        this.name = name;
    }
    public Animal(int age, String animal) {
        this.age = age;
        this.animal = animal;
    }
    public Animal() {

    }

}
