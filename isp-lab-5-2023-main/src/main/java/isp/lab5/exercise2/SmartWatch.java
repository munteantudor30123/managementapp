package isp.lab5.exercise2;

public class SmartWatch implements Chargeable{

    private  int batteryLevel;
    SmartWatch(int batteryLevel)
    {
        this.batteryLevel=batteryLevel;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void charge(int durationMinutes) {
        batteryLevel += durationMinutes;

        if (batteryLevel > 100) {
            batteryLevel = 100;
        }
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "batteryLevel=" + batteryLevel +
                '}';
    }
}

