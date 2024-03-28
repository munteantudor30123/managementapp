package isp.lab5.exercise3;

public class MonitoringService {
    private Sensor[] sensors= new Sensor[10];

    public MonitoringService(Sensor[] sensors) {
        this.sensors = sensors;
    }
    public double getAverageTemperatureSensors() {
        double sum = 0;
        int count = 0;
        for (Sensor sensor : sensors) {
            sum += ((Sensor) sensor).getValue();
                count++;

        }
        return sum/count;
    }
    public double getAveragePressureSensors() {
        double sum = 0;
        int count = 0;
        for (Sensor sensor : sensors) {
            sum += ((Sensor) sensor).getValue();
            count++;

        }
        return sum/count;
    }


}

