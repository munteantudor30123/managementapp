package isp.lab7.safehome;

import javax.naming.OperationNotSupportedException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Radu Miron
 * @version 1
 */
public class DoorLockController implements ControllerInterface {
    private Map<Tenant, AccessKey> validAccess = new HashMap<>();

    private int failedAttempts = 0;
    private static final int MAX_FAILED_ATTEMPTS = 3;
    private boolean tooManyAttempts() {
        failedAttempts++;

        if (failedAttempts >= MAX_FAILED_ATTEMPTS) {
            return true;
        }

        return false;
    }
    private boolean isValidPin(String pin) {
        for (AccessKey accessKey : validAccess.values()) {
            if (accessKey.getPin().equals(pin)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public DoorStatus enterPin(String pin) throws Exception {
        if (tooManyAttempts()) {
            throw new TooManyAttemptsException("Too many failed attempts! Access denied.");
        }

        if (isValidPin(pin)) {
            return DoorStatus.OPEN;
        } else {

            return DoorStatus.CLOSE;
        }
    }
    @Override
    public DoorStatus validPin(String pin) throws Exception{
        if(!isValidPin(pin))
        {
            throw new InvalidPinException("Too many failed attempts! Access denied.");
        }
        return DoorStatus.CLOSE;
    }
    @Override
    public void addTenant(String pin, String name) throws Exeception{
        AccessKey accessKey = new AccessKey(pin);
        Tenant tenant = new Tenant(name);

        if (!validAccess.containsKey(tenant)) {
            validAccess.put(tenant, accessKey);
            System.out.println("Added new tenant: " + name);
        } else {
            throw new TenantAlreadyExistsException(name);
        }
    }

    @Override
    public void removeTenant(String name) throws Exception {
        AccessLog accessLogs=new AccessLog();
        if (validAccess.containsKey(new Tenant(name))) {
            validAccess.remove(new Tenant(name));
            System.out.println("Removed tenant: " + name);
            accessLogs.add(new AccessLog(name, LocalDateTime.now(), "Remove Tenant", DoorStatus.OPEN, null));
        } else {
            throw new TenantNotFoundException(name);
        }
    }

    public List<AccessLog> getAccessLogs() {
        int accessLogs = 0;
        return new ArrayList<>(accessLogs);
    }




}
