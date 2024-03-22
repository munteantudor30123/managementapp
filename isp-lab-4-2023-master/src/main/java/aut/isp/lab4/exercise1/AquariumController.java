package aut.isp.lab4.exercise1;

public class AquariumController {

    private String manufacturer;
    private String model;
    private float currentTime;
    public AquariumController(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }
    public void setCurrentTime(float currentTime) {
        this.currentTime = currentTime;
    }


    public String toString() {
        return "AquariumController{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", currentTime=" + currentTime +
                '}';
    }
    public float getCurrentTime() {
        return currentTime;
    }


}
