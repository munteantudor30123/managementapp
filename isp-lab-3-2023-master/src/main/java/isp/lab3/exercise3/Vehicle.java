package isp.lab3.exercise3;

public class Vehicle {
    private String model;
    private String type;
    private int speed;
    private char fuelType;
    private static int numberOfVehicles = 0;

    public  Vehicle(String model, String type, int speed, char fuelType) {
        this.model = model;
        this.type = type;
        this.speed = speed;
        this.fuelType = fuelType;
        numberOfVehicles++;
    }
        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public int getSpeed() {
            return speed;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }

        public char getFuelType() {
            return fuelType;
        }

        public void setFuelType(char fuelType) {
            this.fuelType = fuelType;
        }
    public String toString() {
        return "{" + model + " (" + type + ") speed " + speed + " fuel type " + fuelType + "}";
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return speed == vehicle.speed &&
                fuelType == vehicle.fuelType &&
                model.equals(vehicle.model) &&
                type.equals(vehicle.type);
    }
    public static void displayNumberOfVehicles() {
        System.out.println("Number of Vehicle objects created: " + numberOfVehicles);
    }
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Dacia", "Logan", 150, 'B');
        Vehicle vehicle2 = new Vehicle("Ford", "Focus", 180, 'D');

        // Testing getters and setters
        System.out.println("Vehicle 1 model: " + vehicle1.getModel());
        System.out.println("Vehicle 1 type: " + vehicle1.getType());
        System.out.println("Vehicle 1 speed: " + vehicle1.getSpeed());
        System.out.println("Vehicle 1 fuel type: " + vehicle1.getFuelType());

        // Testing toString() method
        System.out.println("Vehicle 1: " + vehicle1.toString());
        System.out.println("Vehicle 2: " + vehicle2.toString());

        // Testing equals() method
        System.out.println("Are vehicle1 and vehicle2 equal? " + vehicle1.equals(vehicle2));
        Vehicle.displayNumberOfVehicles();

    }
}
