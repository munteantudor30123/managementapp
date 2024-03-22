package aut.isp.lab4.exercise3;

import aut.isp.lab4.exercise2.FishFeeder;
import aut.isp.lab4.exercise3.AquariumController;

import java.util.ArrayList;
import java.util.List;

public class Exercise3 {
    public static void main(String[] args) {
        FishFeeder fishFeeder = new FishFeeder("Example Feeder Manufacturer", "Feeder Model");
        List<Float> feedingTimes = new ArrayList<>();
        feedingTimes.add(8.0f);
        feedingTimes.add(14.50f);
        AquariumController aquariumController = new AquariumController("Example Controller Manufacturer", "Controller Model", fishFeeder, feedingTimes);
        System.out.println("Setting current time to feeding time (8:00 AM)...");
        aquariumController.setCurrentTime(8.0f);
        System.out.println("\nSetting current time to non-feeding time (14:30 PM)...");
        aquariumController.setCurrentTime(12.0f);


    }
}
