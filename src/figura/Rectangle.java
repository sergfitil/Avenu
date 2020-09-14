package figura;

public class Rectangle {
    private int a;
    private int b;
public Rectangle (int a,int b){
    this.a=a;
    this.b=b;
}
    public int getA() {
        return this.a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return this.b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int areaRectangle() {
        int area = a + b;
        return area;
    }
    public int perimetrRectangle(){
        int perimetr = (a+b)*2;
        return perimetr;
    }
}
