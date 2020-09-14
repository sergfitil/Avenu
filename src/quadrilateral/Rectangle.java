package quadrilateral;

import quadrilateral.Square;

public class Rectangle extends Square {
    protected int storona2;

    public int getStorona2() {
        return storona2;
    }

    public void setStorona2(int storona2) {
        this.storona2 = storona2;
    }

    public Rectangle() {

    }

    public Rectangle(int storona, int storona2, String colour, String material) {
        this.storona=storona;
        this.storona2 = storona2;
        this.colour = colour;
        this.material = material;

    }
}
