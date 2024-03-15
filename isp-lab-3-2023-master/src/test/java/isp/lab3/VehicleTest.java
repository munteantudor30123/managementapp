package isp.lab3;

import static org.junit.Assert.assertEquals;

import isp.lab3.exercise3.Vehicle;
import org.junit.Test;
public class VehicleTest {
    @Test
    public void testToString() {

        Vehicle vehicle = new Vehicle("Mercedes", "S", 200, 'B');

        String expected = "{Mercedes (S) speed 200 fuel type B}";

        String actual = vehicle.toString();

        assertEquals(expected, actual);
    }
}
