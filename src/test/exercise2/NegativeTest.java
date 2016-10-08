package exercise2;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Davud_Murtazin on 9/27/2016.
 */
public class NegativeTest {

    @DataProvider(name = "createDoubles")
    public Object[][] createDoubles() {
        return new Object[][] {
                { 4.7, 5.5 },
                { -4.2, 5.1 },
                { 6.1, -3.4 },
                { -6.1, -3.5 }
        };
    }

    @Test(dataProvider = "createDoubles")
    public void testCheckCoordinates(double x, double y) throws Exception {
        Assert.assertFalse(CoordinateUtil.checkCoordinates(x, y));
    }
}
