package aut.isp.lab4.exercise2;

public class Exercise2 {
    public static void main(String[] args) {
        FishFeeder fishFeeder = new FishFeeder("Manufacturer", "Y");
        System.out.println("Initial state of Fish Feeder:");
        System.out.println(fishFeeder);
        fishFeeder.fillUp();
        System.out.println("\nState of Fish Feeder after filling up:");
        System.out.println(fishFeeder);

    }
}
