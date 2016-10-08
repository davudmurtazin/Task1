package exercise1;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.remote.strprotocol.AbstractRemoteTestRunnerClient;

/**
 * Created by Davud_Murtazin on 10/6/2016.
 */
public class PositiveTest {

    @DataProvider(name = "createDoubles")
    public Object[][] createDoubles() {
        return new Object[][] {
                { 11.2, 14.6, 11.304776102715723}
                ,{ 6.3, 3.1, 6.421036352559475}
                ,{ 9.4, 3.6, 9.503354002994932}
                ,{ 5.2, 6.4, 5.4332270734692685}};
    }

    @Test(dataProvider = "createDoubles")
    public void testCreateDoubles(double x, double y, double result) throws Exception {
        Assert.assertEquals(result, ParameterUtil.solveTheEquation(x, y), 0.0001);
    }
}
