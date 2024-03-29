package isp.lab5.exercise4;

public class TicketsManager {
    public Ticket generateTicket(String serialNumber) {
        Ticket ticket = new Ticket(serialNumber);
        System.out.println("Ticket with serial number " + serialNumber + " has been generated.");
        return ticket;
    }
    public boolean validateTicket(Ticket ticket) {
        if (ticket != null && ticket.isValid()) {
            System.out.println("Ticket with serial number " + ticket.getSerialNumber() + " is valid.");
            return true;
        } else {
            System.out.println("Ticket is invalid or does not exist.");
            return false;
        }
    }
}
