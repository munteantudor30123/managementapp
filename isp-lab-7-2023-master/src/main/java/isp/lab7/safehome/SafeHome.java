package isp.lab7.safehome;

public class SafeHome {

    public static void main(String[] args) {

        DoorLockController doorLockController = new DoorLockController();

        try {

            doorLockController.addTenant("1234", "Tudor");

            System.out.println("Attempting to enter PINs...");
            System.out.println("Entered PIN: 1234");
            doorLockController.enterPin("1234");
            System.out.println("Entered PIN: 5678");
            doorLockController.enterPin("5678");
            System.out.println("Entered PIN: 1234");
            doorLockController.enterPin("1234");

        } catch (TooManyAttemptsException e) {
            System.out.println("Too many attempts. Access denied!");
        } catch (InvalidPinException e) {
            System.out.println("Invalid PIN entered!");
        } catch (TenantAlreadyExistsException e) {
            System.out.println("Tenant already exists!");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }


    }

