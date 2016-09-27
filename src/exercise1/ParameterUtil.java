package exercise1;

import java.util.Scanner;

/**
 * Created by Davud_Murtazin on 9/24/2016.
 */
public class ParameterUtil {
    private double XX = 6.1;
    private double YY = 7.2;

    public Parameter setParameters(Parameter parametr){
        parametr.setX(XX);
        parametr.setY(YY);
        return parametr;
    }

    public double solveTheEquation(Parameter parameter){
        double equation = (1 + Math.sqrt(Math.sin(parameter.getX() + parameter.getY()))) /
                (2 + Math.abs(parameter.getX() - ((2 * parameter.getX()) /
                (1 + (Math.sqrt(parameter.getX() * Math.sqrt(parameter.getY()))))))) + parameter.getX();
        return equation;
    }

    public void printSolution(Parameter parameter, double result){
        System.out.printf("X = %.2f Y = %.2f \nResult: %.3f", parameter.getX(), parameter.getY(), result);
    }
}
