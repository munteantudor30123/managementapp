package aut.isp.lab4.exercise1;

public class Exercise1 {

    public static void main(String[] args) {
        //create an object
        AquariumController aquariumController = new AquariumController(" Manufacturer", " X");
        aquariumController.setCurrentTime(10.5f);
        System.out.println("Aquarium Controller Details:");
        System.out.println(aquariumController);
    }
}
