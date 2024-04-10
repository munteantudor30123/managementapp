package isp.lab7.safehome;

public class TenantNotFoundException extends Exception {
    public TenantNotFoundException(String name) {
        super(String.format("Tenant %s dosen't exists!", name));
    }
}
