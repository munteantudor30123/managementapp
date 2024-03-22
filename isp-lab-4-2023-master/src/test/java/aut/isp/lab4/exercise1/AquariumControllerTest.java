package aut.isp.lab4.exercise1;

import org.junit.Test;
import static org.junit.Assert.*;

public class AquariumControllerTest {

    @Test
    public void testSetCurrentTime() {
        AquariumController aquariumController = new AquariumController("Test Manufacturer", "Test Model");
        aquariumController.setCurrentTime(15.75f);
        assertEquals(15.75f, aquariumController.getCurrentTime(),0.001);
    }

    @Test
    public void testToString() {
        AquariumController aquariumController = new AquariumController("Test Manufacturer", "Test Model");
        aquariumController.setCurrentTime(15.75f);
        String expected = "AquariumController{manufacturer='Test Manufacturer', model='Test Model', currentTime=15.75}";
        assertEquals(expected, aquariumController.toString());
    }
}
