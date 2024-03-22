package aut.isp.lab4.exercise2;

public class FishFeeder {
    private String manufacturer;
    private String model;
    private int meals;
    public FishFeeder(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.meals = 0; // By default, the feeder starts with 0 meals
    }
    public void feed() {
        if (meals > 0) {
            meals--;
            System.out.println("Remaining meals: " + meals);
        } else {
            System.out.println("No meals left");
        }

        }
    public void fillUp() {
        meals = 14;
        System.out.println("Filled up with 14 meals.");
    }
    public String toString() {
        return "FishFeeder{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", meals=" + meals +
                '}';
    }
    public int getMeals() {
        return meals;
    }

}
