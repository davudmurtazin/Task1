package exercise4;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;

/**
 * Created by Davud_Murtazin on 10/7/2016.
 */
public class ArrayUtilTest {
    private ArrayList<Integer> indexes;
    private List<Integer> array;

    @BeforeTest
    public void setArray(){
        array = new ArrayList<>();
        array.add(4);
        array.add(3);
        array.add(5);
        array.add(7);
        array.add(8);

        indexes = new ArrayList<>();
        indexes.add(1);
        indexes.add(2);
        indexes.add(3);
    }

    @Test
    public void testGetIndexesOfPrimeNumbers() throws Exception {
        Assert.assertEquals(indexes, ArrayUtil.getIndexesOfPrimeNumbers(array));
    }

    @AfterTest
    public void clearLists(){
        array.clear();
        indexes.clear();
    }

}