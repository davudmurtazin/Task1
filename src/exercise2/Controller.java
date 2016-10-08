package exercise2;

import exercise2.CoordinateUtil;

/**
 * Created by Davud_Murtazin on 9/26/2016.
 */
public class Controller {
    public static void main(String[] args) {
        Coordinate coordinate = new Coordinate();
        CoordinateUtil.initCoordinates(coordinate);
        CoordinateUtil.printResult(CoordinateUtil.checkCoordinates(coordinate.getCoordX(), coordinate.getCoordY()));
    }

}
