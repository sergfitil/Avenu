package figura;

public class FiguraSquare {
    private int storona;
    public FiguraSquare(int storona){
       this.storona=storona;
    }

    public int getStorona(){
        return this.storona;
    }
    public void setStorona(int storona) {
        this.storona = storona;
    }
    public double perimetrSquare() {
        double perimetr = storona * 4;
        return perimetr;
    }

    public double areaSquare() {
        double area = storona*storona;
        return area;
    }
}
