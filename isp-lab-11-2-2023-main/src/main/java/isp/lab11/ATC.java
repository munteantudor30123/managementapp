package isp.lab11;

import java.util.HashMap;
import java.util.Map;

public class ATC {
    private Map<String, Aircraft> aircraftById = new HashMap<>();

    public void addAircraft(String id) {
        Aircraft aircraft = new Aircraft(id);
        aircraft.start();
        aircraftById.put(id, aircraft);
        System.out.println("Aircraft with id " + id + " added");
    }

    public void sendCommand(String id, AtcCommand command) {
        Aircraft aircraft = aircraftById.get(id);
        aircraft.receiveAtcCommand(command);
        System.out.println("Aircraft with id " + id + " received command " + command);
    }

    public void showAircrafts() {
        System.out.println("Display aircrafts.");
        //todo: print all the aircrafts into the console (id, state)
        for (Map.Entry<String, Aircraft> entry : aircraftById.entrySet()) {
            String id = entry.getKey();
            Aircraft aircraft = entry.getValue();
            System.out.println("Aircraft ID: " + id + ", State: " + aircraft);
        }
    }
}

class AtcCommand {
    private AtcCommandType command;

    public AtcCommand(AtcCommandType command) {
        this.command = command;
    }

    public AtcCommandType getCommand() {
        return command;
    }

    @Override
    public String toString() {
        return "AtcCommand{" +
                "command='" + command + '\'' +
                '}';
    }
}

enum AtcCommandType {
    TAKEOFF_CMD,
    LAND_CMD
}
