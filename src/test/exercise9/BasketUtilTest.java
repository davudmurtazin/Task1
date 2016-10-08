package exercise9;

import exercise9.util.BasketUtil;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.testng.Assert.*;

/**
 * Created by Davud_Murtazin on 10/8/2016.
 */
public class BasketUtilTest {
    private ArrayList<Ball> balls = new ArrayList<>();

    @BeforeTest
    public void setList(){
        Ball yellowBall = new Ball(4.3,"yellow");
        Ball blueBall1 = new Ball(3.2, "blue");
        Ball redBall = new Ball(2.3, "red");
        Ball blueBall2 = new Ball(3.4, "blue");
        balls.add(yellowBall);
        balls.add(blueBall1);
        balls.add(redBall);
        balls.add(blueBall2);
    }

    @Test
    public void testSumWeightOfBasket() throws Exception {
        Assert.assertEquals(13.200000000000001, BasketUtil.sumWeightOfBasket(balls));
    }

    @Test
    public void testGetNumberOfBlueBalls() throws Exception {
        Assert.assertEquals(2, BasketUtil.getNumberOfBlueBalls(balls));
    }

}