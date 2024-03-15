package isp.lab3.exercise5;

import java.util.HashMap;
import java.util.Map;

public class VendingMachine {
    private Map<Integer, String> products;
    private int credit;

    public VendingMachine() {
        products = new HashMap<>();
        products.put(1, "Soda");
        products.put(2, "Chips");
        products.put(3, "Candy");
        products.put(4, "Water");

        credit = 0;
    }
    public void displayProducts() {
        System.out.println("Available Products:");
        for (Map.Entry<Integer, String> entry : products.entrySet()) {
            System.out.println(entry.getKey() + ". " + entry.getValue());
        }
    }

    public void insertCoin(int value) {
        credit += value;
    }

    public String selectProduct(int id) {
        if (products.containsKey(id)) {
            if (credit >= 5) { // Pretul unui produs e 5 credite
                credit -= 5;
                return products.get(id);
            } else {
                return "Insufficient credit. Please insert coins.";
            }
        } else {
            return "Invalid selection. Please select a valid product.";
        }
    }


    public void displayCredit() {
        System.out.println("Current Credit: " + credit);
    }


    public void userMenu() {
        System.out.println("Welcome to the Vending Machine!");
        System.out.println("1. Display Products");
        System.out.println("2. Insert Coin");
        System.out.println("3. Select Product");
        System.out.println("4. Display Credit");
        System.out.println("5. Exit");

    }

    public static void main(String[] args) {

        VendingMachine vendingMachine = new VendingMachine();

        vendingMachine.displayProducts();
        vendingMachine.insertCoin(15);
        vendingMachine.displayCredit();
        System.out.println(vendingMachine.selectProduct(4));
        vendingMachine.displayCredit();
    }
}

