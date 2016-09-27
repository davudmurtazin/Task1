package exercise3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;

import static org.junit.Assert.*;

/**
 * Created by Davud_Murtazin on 9/27/2016.
 */
@RunWith(Parameterized.class)
public class PositiveTest {
    private LinkedHashMap<Double, Double> hashMap = new LinkedHashMap<>();
    private Line line;


    @Before
    public void setUp() throws Exception {
        hashMap.put(5.0, -3.380515006246586);
        hashMap.put(8.5, -1.326364327785607);
        hashMap.put(8.8, -0.7211468755756028);
        hashMap.put(1.4, 5.797883715482887);
    }

    @Test
    public void addToTable11() throws Exception {
        line = new Line(1,10,0.2);
        Assert.assertEquals(hashMap, LineUtil.addToTable(line));
    }
}