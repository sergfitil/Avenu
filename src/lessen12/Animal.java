package lessen12;

import java.util.Objects;

public class Animal {
    private int age;
    private String name;

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public Animal(){

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return getAge() == animal.getAge() &&
                Objects.equals(getName(), animal.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAge(), getName());
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public void voice(){
        System.out.println("мммммммммммммяяяяяяяяяяуууууууу");

    }
}
