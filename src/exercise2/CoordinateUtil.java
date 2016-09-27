package exercise2;

import java.util.Scanner;

/**
 * Created by Davud_Murtazin on 9/26/2016.
 */
public class CoordinateUtil {

    public static Coordinate initCoordinates(Coordinate coordinate){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter x: ");
        double x = sc.nextDouble();
        System.out.println("Enter y: ");
        double y = sc.nextDouble();

        coordinate.setCoordX(x);
        coordinate.setCoordY(y);

        return coordinate;
    }

    public static boolean checkCoordinates(Coordinate coordinate){
        if(coordinate.getCoordX() > 4 && coordinate.getCoordY() > 5 ||
                coordinate.getCoordX() < -4 && coordinate.getCoordY() > 5 ||
                coordinate.getCoordX() > 6 && coordinate.getCoordY() < -3.3 ||
                coordinate.getCoordX() < -6 && coordinate.getCoordY() < -3.3){
            return false;
        }
        else {
            return true;}
    }

    public static void printResult(boolean result){
        if(result == true){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
