package exercise7;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by Davud_Murtazin on 10/8/2016.
 */
public class ArrayUtilTest {

    @DataProvider(name = "createArrays")
    public Object[][] createArrays() {
        return new Object[][] {
                { new double[]{5.1, 3.2, 8.4, 7.1}, new double[]{3.2, 5.1, 7.1, 8.4}}
                ,{ new double[]{10.2, 1.6, 7.2, 6.9, 2.4} , new double[]{1.6, 2.4, 6.9, 7.2, 10.2}}};
    }

    @Test(dataProvider = "createArrays")
    public void testSortArray(double [] inputArray, double[] resultArray) throws Exception {
        Assert.assertEquals(resultArray, ArrayUtil.sortArray(inputArray));
    }

}