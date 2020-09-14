package exceptions;

public class People {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws UnCurrentAgeEception {
        if (age < 0 || age > 150) {
            throw new UnCurrentAgeEception("Возраст не может быть меньше 0 и старше 150 лет");
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
