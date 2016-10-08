package exercise1;

import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by Davud_Murtazin on 10/7/2016.
 */
public class NegativeTest {

    @DataProvider(name = "createDoublesForNegTest")
    public Object[][] createDoublesForNegTest() {
        return new Object[][] {
                { Double.NaN, 14.6, 11.304776102715723}
                ,{ 6.3, Double.NaN, 6.421036352559475}
                ,{ 9.4, 3.6, Double.NaN}
                ,{ Double.NaN, Double.NaN, 5.4332270734692685}};
    }

    @Test(dataProvider = "createDoublesForNegTest")
    public void testSolveTheEquation(double x, double y, double result) throws Exception {
        Assert.assertNotEquals(result, new ParameterUtil().solveTheEquation(x, y), 0.0001);
    }

}