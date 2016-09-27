package exercise2;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by Davud_Murtazin on 9/27/2016.
 */
@RunWith(Parameterized.class)
public class NegativeTest {
    private double x;
    private double y;
    Coordinate coordinate;

    public NegativeTest(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 4.7, 5.5 },
                { -4.2, 5.1 },
                { 6.1, -3.4 },
                { -6.1, -3.5 }
        });
    }

    @Test
    public void checkCoordinates() throws Exception {
        coordinate = new Coordinate(x,y);
        Assert.assertNotEquals(true, CoordinateUtil.checkCoordinates(coordinate));
    }
}
