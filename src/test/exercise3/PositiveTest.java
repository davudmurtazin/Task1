package exercise3;

import exercise2.CoordinateUtil;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.LinkedHashMap;

/**
 * Created by Davud_Murtazin on 9/27/2016.
 */
public class PositiveTest {
    private LinkedHashMap<Double, Double> hashMap;

    @BeforeTest
    public void setUp() throws Exception {
        hashMap = new LinkedHashMap<>();
        hashMap.put(1.0, 1.5574077246549023);
        hashMap.put(2.5, -0.7470222972386603);
        hashMap.put(4.0, 1.1578212823495777);
        hashMap.put(5.5, -0.995584052213885);
        hashMap.put(7.0, 0.8714479827243187);
        hashMap.put(8.5, -1.326364327785607);
        hashMap.put(10.0, 0.6483608274590866);
    }

    @Test
    public void checkInitLine() throws Exception {
        Assert.assertEquals(hashMap, LineUtil.addToTable(1.0,10.0,1.5));
    }

    @AfterTest
    public void cleahHashMap(){
        hashMap.clear();
    }
}