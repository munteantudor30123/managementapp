 package isp.lab5.exercise3;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise3Test {
    @Test
    public void testPressureSensor() {
        PressureSensor sensor = new PressureSensor("Room", "Pressure Sensor", 1013.25);
        assertEquals("Room", sensor.getInstallLocation());
        assertEquals("Pressure Sensor", sensor.getName());
        assertEquals(1013.25, sensor.getValue(), 0.01);
    }

    @Test
    public void testTemperatureSensor() {
        TemperatureSensor sensor = new TemperatureSensor("Room", "Temperature Sensor", 25.5);
        assertEquals("Room", sensor.getInstallLocation());
        assertEquals("Temperature Sensor", sensor.getName());
        assertEquals(25.5, sensor.getValue(), 0.01);
    }
}


