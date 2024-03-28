package isp.lab5.exercise3;

public class Exercise3 {
        public static void main(String[] args) {

            Sensor[] sensors = new Sensor[4];
            sensors[0] = new TemperatureSensor("Room", "Temperature Sensor 1", 20);
            sensors[1] = new TemperatureSensor("Outside", "Temperature Sensor 2", 30);
            sensors[2] = new PressureSensor("Room", "Pressure Sensor 1", 1013);
            sensors[3] = new PressureSensor("Outside", "Pressure Sensor 2", 1000);

            MonitoringService monitoringService = new MonitoringService(sensors);

            double averageTemperature = monitoringService.getAverageTemperatureSensors();
            System.out.println("Average Temperature: " + averageTemperature);

            double averageAllSensors = monitoringService.getAveragePressureSensors();
            System.out.println("Average Pressure: " + averageAllSensors);
        }
    }

