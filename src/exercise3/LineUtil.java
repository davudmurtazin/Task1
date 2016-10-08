package exercise3;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Davud_Murtazin on 9/26/2016.
 */
public class LineUtil {
    private static LinkedHashMap<Double, Double> hashMap = new LinkedHashMap<>();

    public static Line initLine(Line line){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a: ");
        double a = sc.nextDouble();
        System.out.println("Enter b: ");
        double b = sc.nextDouble();
        System.out.println("Enter h: ");
        double h = sc.nextDouble();

        line.setA(a);
        line.setB(b);
        line.setH(h);

        return line;
    }

    public static LinkedHashMap<Double, Double> addToTable(double a, double b, double h){
        if(h <= 0 && a <= 0 && b <= 0){
            System.out.println("Values have to be positive!");
        }
        else{
            for(double requiredValue = a; requiredValue <= b; requiredValue += h){
                double equation = Math.tan(requiredValue);
                hashMap.put(requiredValue,equation);
            }
        }
        return hashMap;
    }

    public static void printHashMapValue(LinkedHashMap<Double, Double> hashmap){
        System.out.println("---------------------------");
        System.out.println("Testing number   |  Value of the function");
        for (Map.Entry value: hashmap.entrySet()) {
            System.out.println("|" + value.getKey() + "|" + value.getValue()+ "|");
            System.out.println("---------------------------");
        }
    }
}
