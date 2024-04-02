package isp.lab6.exercise2;

import java.util.HashSet;
import java.util.Set;

public class VehicleRegistry {
    private Set<Vehicle> vehicles;

    public VehicleRegistry() {
        vehicles = new HashSet<>();
    }

    public void addVehicle(Vehicle vehicle) {
        if (!vehicles.contains(vehicle)) {
            vehicles.add(vehicle);
            System.out.println("Vehicle added successfully.");
        } else {
            System.out.println("Vehicle with the same VIN already exists in the registry.");
        }
    }

    public void removeVehicle(String vin) {
        Vehicle vehicleToRemove = null;
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getVin().equals(vin)) {
                vehicleToRemove = vehicle;
                break;
            }
        }
        if (vehicleToRemove != null) {
            vehicles.remove(vehicleToRemove);
            System.out.println("Vehicle removed successfully.");
        } else {
            System.out.println("Vehicle with VIN " + vin + " not found in the registry.");
        }
    }

    public boolean checkVehicle(String vin) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getVin().equals(vin)) {
                return true;
            }
        }
        return false;
    }

    public void displayRegistry() {
        if (vehicles.isEmpty()) {
            System.out.println("Vehicle registry is empty.");
        } else {
            System.out.println("List of vehicles in the registry:");
            for (Vehicle vehicle : vehicles) {
                System.out.println(vehicle);
            }
        }
    }
}


