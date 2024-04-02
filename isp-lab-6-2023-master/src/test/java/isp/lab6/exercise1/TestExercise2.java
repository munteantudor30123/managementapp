package isp.lab6.exercise2;

import static org.junit.Assert.*;


import isp.lab6.exercise2.VehicleRegistry;
import org.junit.*;

public class TestExercise2 {

    private VehicleRegistry registry;

    @Before
    public void setUp() {
        registry = new VehicleRegistry();
    }

    @Test
    public void testAddVehicle() {
        Vehicle vehicle = new Vehicle("VIN123", "ABC123", "Toyota", "Corolla", 2022);
        registry.addVehicle(vehicle);
        assertTrue(registry.checkVehicle("VIN123"));
    }

    @Test
    public void testRemoveVehicle() {
        Vehicle vehicle = new Vehicle("VIN123", "ABC123", "Toyota", "Corolla", 2022);
        registry.addVehicle(vehicle);
        registry.removeVehicle("VIN123");
        assertFalse(registry.checkVehicle("VIN123"));
    }

    @Test
    public void testCheckVehicleExists() {
        Vehicle vehicle = new Vehicle("VIN123", "ABC123", "Toyota", "Corolla", 2022);
        registry.addVehicle(vehicle);
        assertTrue(registry.checkVehicle("VIN123"));
    }

    @Test
    public void testCheckVehicleNotExists() {
        assertFalse(registry.checkVehicle("VIN456"));
    }
}

