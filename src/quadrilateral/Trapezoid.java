package quadrilateral;

public class Trapezoid extends Rectangle {
    protected int storona3;
    protected int storona4;

    public int getStorona3() {
        return storona3;
    }

    public void setStorona3(int storona3) {
        this.storona3 = storona3;
    }

    public int getStorona4() {
        return storona4;
    }

    public void setStorona4(int storona4) {
        this.storona4 = storona4;
    }
    public Trapezoid(){

    }
    public Trapezoid(int storona,int storona2,int storona3,int storona4,String colour,String material){
this.storona=storona;
this.storona2=storona2;
this.storona3=storona3;
this.storona4=storona4;
this.colour=colour;
this.material=material;
    }
}
