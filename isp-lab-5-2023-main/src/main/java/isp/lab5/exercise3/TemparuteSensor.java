package isp.lab5.exercise3;

public class TemparuteSensor {
    private double temperature;

    @Override
    public String toString() {
        return "TemparuteSensor{" +
                "temperature=" + temperature +
                '}';
    }

    public TemparuteSensor(double temperature)
    {
        this.temperature=temperature;
    }

}
