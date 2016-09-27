package exercise1;


/**
 * Created by Davud_Murtazin on 9/24/2016.
 */
public class Controller {
    public static void main(String[] args) {
        Parameter parameter = new Parameter();
        ParameterUtil parameterUtil = new ParameterUtil();
        parameterUtil.setParameters(parameter);
        double result = parameterUtil.solveTheEquation(parameter);
        parameterUtil.printSolution(parameter, result);
    }
}