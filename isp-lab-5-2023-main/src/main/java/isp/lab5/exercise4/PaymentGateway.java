package isp.lab5.exercise4;

public class PaymentGateway {
    private String card;

    public PaymentGateway(String card) {
        this.card = card;
    }
    public boolean processCardPayment(double amount, String cardNumber, String cvv, String expiryDate) {

        System.out.println("Processing card payment of " + amount + " with card number " + cardNumber + "...");
        return true;
    }
}

