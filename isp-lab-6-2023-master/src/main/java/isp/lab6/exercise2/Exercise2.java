package isp.lab6.exercise2;

public class Exercise2 {

    public static void main(String[] args) {
        VehicleRegistry registry = new VehicleRegistry();

        registry.addVehicle(new Vehicle("VIN123", "CJ456", "Mercedes", "SClass", 2023));
        registry.addVehicle(new Vehicle("VIN456", "MM279", "Mercedes", "GLS", 2022));

        registry.displayRegistry();

        registry.removeVehicle("VIN123");

        System.out.println("Vehicle with VIN456 exists: " + registry.checkVehicle("VIN456"));

        registry.displayRegistry();
    }
}


