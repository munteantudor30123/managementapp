package aut.isp.lab4.exercise3;

import aut.isp.lab4.exercise2.FishFeeder;

import java.util.List;

public class AquariumController {
    private String manufacturer;
    private String model;
    private float currentTime;
    private  float feedingTime;
    private List<Float> feedingTimes;
    private FishFeeder feeder;
    public AquariumController(String manufacturer, String model, FishFeeder feeder, List<Float> feedingTimes) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.feeder = feeder;
        this.feedingTimes = feedingTimes;
    }
    public void setCurrentTime(float currentTime) {
        this.currentTime = currentTime;
        checkFeedingTime();
    }

    private void checkFeedingTime() {
        for (float feedingTime : feedingTimes) {
            int hour = (int) feedingTime;
            int minute = (int) ((feedingTime - hour) * 100);
            if ((int) currentTime == hour && (int) ((currentTime - hour) * 100) == minute) {
                feeder.feed();
                break;
            }
        }
    }
    public void addFeedingTime(float feedingTime) {
        feedingTimes.add(feedingTime);
    }
    public String toString() {
        return "AquariumController{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", currentTime=" + currentTime +
                '}';
    }

}
