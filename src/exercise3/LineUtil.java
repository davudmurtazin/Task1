package exercise3;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Davud_Murtazin on 9/26/2016.
 */
public class LineUtil {
    private static LinkedHashMap<Double, Double> hashMap;

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

    public static LinkedHashMap<Double, Double> addToTable(Line line){
        hashMap = new LinkedHashMap<>();
        if(line.getH() <= 0 && line.getA() <= 0 && line.getB() <= 0){
            System.out.println("Values have to be positive!");
        }
        else{
            for(double requiredValue = line.getA(); requiredValue <= line.getB(); requiredValue += line.getH()){
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
