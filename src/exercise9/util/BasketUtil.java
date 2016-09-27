package exercise9.util;

import exercise9.Ball;
import exercise9.Basket;

import java.util.ArrayList;

/**
 * Created by Davud_Murtazin on 9/27/2016.
 */
public class BasketUtil {

    public static double sumWeightOfBasket(ArrayList<Ball> balls){
        double sumWeight = 0;
        for (Ball ball: balls) {
            sumWeight += ball.getWeight();
        }
        return sumWeight;
    }

    public static int getNumberOfBlueBalls(ArrayList<Ball> balls){
        String blueColor = "blue";
        int numberOfBlueBalls = 0;
        for(Ball ball : balls){
            if(ball.getColor().contains(blueColor)){
                numberOfBlueBalls++;
            }
        }
        return numberOfBlueBalls;
    }

    public static void addBallToBasket(Ball ball, Basket basket){
        basket.getBalls().add(ball);
    }

    public static void printResult(double weightOfBasket, int numberOfBlueBalls){
        System.out.println("Weight of basket: " + weightOfBasket + "\n" + "Number of blue balls: " + numberOfBlueBalls);
    }
}
