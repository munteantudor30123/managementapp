package isp.lab11;

import java.util.UUID;

public class Aircraft implements Runnable {
    private static final String STATE_MESSAGE = "Aircraft %s is %s";
    private String id;
    private String lock = UUID.randomUUID().toString();
    private AircraftState state = AircraftState.ON_STAND;

    public Aircraft(String id) {
        this.id = id;
        FileUtils.writeMessage(id, "Aircraft " + id + " is created. Ready to take off. State: " + state);
    }

    public void start() {
        Thread t = new Thread(this);
        t.start();
    }

    public void run() {
        try {
            synchronized (lock) {
                lock.wait();
            }

            this.state = AircraftState.TAXING;
            FileUtils.writeMessage(id, String.format(STATE_MESSAGE, id, state));

            Thread.sleep(10_000);

            this.state = AircraftState.TAKING_OFF;
            FileUtils.writeMessage(id, String.format(STATE_MESSAGE, id, state));

            //todo: implement the rest
        } catch (InterruptedException ignored) {
        }
    }

    public void receiveAtcCommand(AtcCommand command) {
        if ((command.getCommand().equals(AtcCommandType.TAKEOFF_CMD) && AircraftState.ON_STAND.equals(this.state))
                || (command.getCommand().equals(AtcCommandType.LAND_CMD) && AircraftState.CRUISING.equals(this.state))) {
            synchronized (lock) {
                lock.notify();
            }
        }
    }

    private enum AircraftState {
        ON_STAND,
        TAXING,
        TAKING_OFF,
        ASCENDING,
        CRUISING,
        DESCENDING,
        LANDED
    }
}
