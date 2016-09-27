package exercise2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Created by Davud_Murtazin on 9/27/2016.
 */
@RunWith(Parameterized.class)
public class PositiveTest {
    private double x;
    private double y;
    Coordinate coordinate;

    public PositiveTest(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 4, 5 },
                { -2.2, 4.8 },
                { 4, -3.2 },
                { -5, -3.1 }
        });
    }
    

    @Test
    public void checkCoordinates() throws Exception {
        coordinate = new Coordinate(x,y);
        Assert.assertEquals(true, CoordinateUtil.checkCoordinates(coordinate));
    }
}