package isp.lab5.exercise4;

public class OrganizerApp {
    public void performCheckIn(Ticket ticket) {
        if (ticket != null && ticket.isValid()) {
            System.out.println("Check-in for ticket with serial number " + ticket.getSerialNumber() + " successful.");
        } else {
            System.out.println("Check-in failed. Invalid or non-existent ticket.");
        }
    }
}
