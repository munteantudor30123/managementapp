package isp.lab5.exercise3;

public abstract class Sensor {
    protected String installLocation;
    protected String name;

    public Sensor(String installLocation, String name) {
        this.installLocation = installLocation;
        this.name = name;
    }

    public abstract double getValue();

    public String getInstallLocation() {
        return installLocation;
    }

    public String getName() {
        return name;
    }
}

