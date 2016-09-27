package exercise9;

import exercise9.util.BallUtil;
import exercise9.util.BasketUtil;

/**
 * Created by Davud_Murtazin on 9/27/2016.
 */
public class Controller {
    public static void main(String[] args) {
        Ball ball1 = new Ball();
        Ball ball2 = new Ball();
        Ball ball3 = new Ball();
        Basket basket = new Basket();
        BallUtil.initBall(ball1);
        BallUtil.initBall(ball2);
        BallUtil.initBall(ball3);
        BasketUtil.addBallToBasket(ball1, basket);
        BasketUtil.addBallToBasket(ball2, basket);
        BasketUtil.addBallToBasket(ball3, basket);
        int numberOfBlueBalls = BasketUtil.getNumberOfBlueBalls(basket.getBalls());
        double weightOfBasket = BasketUtil.sumWeightOfBasket(basket.getBalls());
        BasketUtil.printResult(weightOfBasket, numberOfBlueBalls);
    }
}
