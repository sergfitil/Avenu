package lesson10;

public class People {
    private String name;
    private String soname;
    private int age = 5;

    public int getAge() {
        return this.age;
    }

    public String getSoname() {
        return soname;
    }

    public void setSoname(String soname) {
        this.soname = soname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char printLastLetterSoname() {
       return this.soname.charAt(this.soname.length()-1);

    }
}
