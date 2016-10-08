package exercise2;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Davud_Murtazin on 10/7/2016.
 */
public class PositiveTest {

    @DataProvider(name = "createDoubles")
    public Object[][] createDoubles() {
        return new Object[][] {
                { 2, 3}
                ,{ -4,5}
                ,{ 6, -2.5}
                ,{ 1, -3}};
    }

    @Test(dataProvider = "createDoubles")
    public void testCheckCoordinates(double x, double y) throws Exception {
        Assert.assertTrue(CoordinateUtil.checkCoordinates(y, x));
    }
}