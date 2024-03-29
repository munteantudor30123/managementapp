package isp.lab5.exercise4;

public class UserApp {
    private Ticket ticket;
    private PaymentGateway paymentGateway;

    public UserApp(Ticket ticket, PaymentGateway paymentGateway) {
        this.ticket = ticket;
        this.paymentGateway = paymentGateway;
    }

    public void buyTicket(Ticket ticket) {
        System.out.println("Ticket with serial number " + ticket.getSerialNumber() + " has been purchased.");
    }

    public void viewTicket(Ticket ticket) {
        System.out.println("Serial number: " + ticket.getSerialNumber());
        System.out.println("Validity: " + (ticket.isValid() ? "Valid" : "Invalid"));
    }

    public void processPayment(double amount) {
        if (paymentGateway != null) {
            if (amount > 0) {
                boolean paymentResult = paymentGateway.processCardPayment(amount, "1234567890123456", "123", "12/24");
                if (paymentResult) {
                    System.out.println("Payment successful!");
                    buyTicket(ticket);
                } else {
                    System.out.println("Payment failed. Please try again.");
                }
            } else {
                System.out.println("Invalid amount for payment.");
            }
        } else {
            System.out.println("Payment gateway not set. Cannot process payment.");
        }
    }
}
