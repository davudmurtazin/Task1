package exercise1;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created by Davud_Murtazin on 9/24/2016.
 */
public class ParameterUtil {

    public static Parameter setParameters(Parameter parameter){
        System.out.println("Enter x: ");
        Scanner scX = new Scanner(System.in);
        double XX = scX.nextDouble();
        System.out.println("Enter y: ");
        Scanner scY = new Scanner(System.in);
        double YY = scY.nextDouble();
        parameter.setX(XX);
        parameter.setY(YY);
        return parameter;
    }

    public static double solveTheEquation(double x, double y){
        double equation =((1 + (Math.sin(x + y)) * (Math.sin(x + y))) / (2 + Math.abs(x - (2 * x /
                          (1 + Math.pow(x, 2) * Math.pow(y, 2))))) + x);
        return equation;
    }

    public static void printSolution(double result){
        System.out.println("Result: " + result);
    }
}
