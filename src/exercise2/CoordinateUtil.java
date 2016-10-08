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

    public static boolean checkCoordinates(double x, double y){
        if(x >= 4 && y >= 5 ||
                x <= -4 && y >= 5 ||
                x >=  6 && y <= -3.3 ||
                x <= -6 && y <= -3.3){
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
