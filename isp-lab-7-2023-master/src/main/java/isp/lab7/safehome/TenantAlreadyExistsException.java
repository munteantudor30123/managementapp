package isp.lab7.safehome;

/**
 * @author Radu Miron
 * @version 1
 */
public class TenantAlreadyExistsException extends Exception {
    public TenantAlreadyExistsException(String name) {
        super(String.format("Tenant %s already exists!", name));
    }
}
