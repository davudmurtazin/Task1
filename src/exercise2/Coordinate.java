package exercise2;

/**
 * Created by Davud_Murtazin on 9/26/2016.
 */
public class Coordinate {
    private double coordX;
    private double coordY;

    public Coordinate(){
    }

    public Coordinate(double coordX, double coordY) {
        this.coordX = coordX;
        this.coordY = coordY;
    }

    public double getCoordX() {
        return coordX;
    }

    public void setCoordX(double coordX) {
        this.coordX = coordX;
    }

    public double getCoordY() {
        return coordY;
    }

    public void setCoordY(double coordY) {
        this.coordY = coordY;
    }
}
