package isp.lab5.exercise4;

public class Ticket {
    private  String serialNumber;
    private boolean valid;

    public Ticket(String serialNumber) {
        this.serialNumber = serialNumber;
        this.valid=true;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    public boolean isValid() {
        return valid;
    }

    public void isCancel() {
        this.valid = false;
    }

}
