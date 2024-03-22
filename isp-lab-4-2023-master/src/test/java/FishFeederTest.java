package aut.isp.lab4.exercise2;

import org.junit.Test;
import static org.junit.Assert.*;
public class FishFeederTest {

    @Test
    public void testFeed() {
        FishFeeder fishFeeder = new FishFeeder("Test Manufacturer", "Test Model");
        fishFeeder.fillUp();
        fishFeeder.feed();
        assertEquals(13, fishFeeder.getMeals());
    }

    @Test
    public void testFillUp() {
        FishFeeder fishFeeder = new FishFeeder("Test Manufacturer", "Test Model");
        fishFeeder.fillUp();
        assertEquals(14, fishFeeder.getMeals());
    }

    @Test
    public void testToString() {
        FishFeeder fishFeeder = new FishFeeder("Test Manufacturer", "Test Model");
        String expected = "FishFeeder{manufacturer='Test Manufacturer', model='Test Model', meals=0}";
        assertEquals(expected, fishFeeder.toString());
    }
}
