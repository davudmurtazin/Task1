package exercise1;


import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created by Davud_Murtazin on 9/24/2016.
 */
public class Controller {
    public static void main(String[] args) {
        Parameter parameter = new Parameter();
        ParameterUtil.setParameters(parameter);
        double result = ParameterUtil.solveTheEquation(parameter.getX(),parameter.getY());
        ParameterUtil.printSolution(result);
    }
}