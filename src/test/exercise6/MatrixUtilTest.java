package exercise6;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by Davud_Murtazin on 10/8/2016.
 */
public class MatrixUtilTest {
    private int[] array;
    private int[] arrayDisplaced;

    @BeforeTest
    public void setMatrix(){
        array = new int[]{6,7,8,9,3};
        arrayDisplaced = new int[]{7,8,9,3,6};
    }

    @Test
    public void testLeftDisplace() throws Exception {
        Assert.assertEquals(arrayDisplaced,MatrixUtil.leftDisplace(array, array.length));
    }

}