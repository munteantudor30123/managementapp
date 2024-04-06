package isp.lab6.exercise3;
import java.util.Scanner;
public class UserInterface {
    private LoginSystem loginSystem;
    private OnlineStore store;

    public UserInterface(LoginSystem loginSystem, OnlineStore store) {
    }

    public void loadInterface() {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter username: ");
                    String username = scanner.nextLine();
                    System.out.print("Enter password: ");
                    String password = scanner.nextLine();
                    if (loginSystem.login(username, password)) {
                        System.out.println("Login successful.");
                    } else {
                        System.out.println("Login failed. Invalid username or password.");
                    }
                    break;
                case 2:
                    System.out.print("Enter username: ");
                    String newUsername = scanner.nextLine();
                    System.out.print("Enter password: ");
                    String newPassword = scanner.nextLine();
                    if (loginSystem.register(newUsername, newPassword)) {
                        System.out.println("Registration successful. You can now login.");
                    } else {
                        System.out.println("Registration failed. Username already exists.");
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }

        scanner.close();
    }


}
