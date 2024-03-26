package isp.lab5.exercise3;

public class PressureSensor {

    private  double pressure;
    public PressureSensor(double pressure) {
        this.pressure=pressure;
    }

    public double getPressure() {
        return pressure;
    }

    @Override
    public String toString() {
        return "PressureSensor{" +
                "pressure=" + pressure +
                '}';
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }
}
