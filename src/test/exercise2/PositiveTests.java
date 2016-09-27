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
public class PositiveTests {
    private double x;
    private double y;
    Coordinate coordinate;

    public PositiveTests(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 0, 0 },
                { 1, 1 },
                { 2, 1 },
                { 3, 2 },
                { 4, 3 },
                { 5, 5 },
                { 5, 4}
        });
    }

    @Test
    public void checkCoordinates() throws Exception {
        coordinate = new Coordinate(x,y);
        Assert.assertEquals(true, CoordinateUtil.checkCoordinates(coordinate));
    }
}