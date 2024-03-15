package isp.lab3;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import isp.lab3.exercise4.MyPoint;

public class MyPointTest {

    @Test
    public void testDistance() {
        // Create two MyPoint objects
        MyPoint point1 = new MyPoint(1, 2, 3);
        MyPoint point2 = new MyPoint(4, 5, 6);

        double expectedDistance = Math.sqrt(27); // Distance between (1,2,3) and (4,5,6)

        double actualDistance = point1.distance(point2);

        assertEquals(expectedDistance, actualDistance, 0.0001); // Allowing for a small error due to floating-point precision
    }
}

