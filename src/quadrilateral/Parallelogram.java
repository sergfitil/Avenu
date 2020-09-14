package quadrilateral;

public class Parallelogram extends Rectangle {
    private int angle;

    public int getAngle() {
        return angle;
    }

    public void setAngle(int angle) {
        this.angle = angle;
    }

    public Parallelogram() {

    }

    public Parallelogram(int storona, int storona2, int angle, String colour, String material) {
        this.storona = storona;
        this.storona2 = storona2;
        this.angle = angle;
        this.colour = colour;
        this.material = material;

    }
}
