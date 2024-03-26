package isp.lab5.exercise3;

import isp.lab5.exercise1.Product;

public class MonitoringService {

    public MonitoringService(Sensor[] sensors) {
        this.sensors = sensors;
    }
    private Sensor[] sensors = new Sensor[][10];

}
