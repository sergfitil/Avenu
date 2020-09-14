package quadrilateral;

public class Square {
    protected int storona;
    protected String colour;
    protected String material;

    public Square(int storona) {
    }

    public int getStorona() {
        return storona;
    }

    public void setStorona(int storona) {
        this.storona = storona;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Square() {
    }

    public Square(int storona, String colour, String material) {
        this.storona = storona;
        this.colour = colour;
        this.material = material;
    }
}
