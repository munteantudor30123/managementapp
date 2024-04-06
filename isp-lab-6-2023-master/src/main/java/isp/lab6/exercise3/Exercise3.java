package isp.lab6.exercise3;

public class Exercise3 {

    public static void main(String[] args) {

        User user = new User("tudor20", "abc123");
        OnlineStore store = new OnlineStore();

        LoginSystem loginSystem = new LoginSystem();
        loginSystem.setStore(store);
        UserInterface userInterface = new UserInterface(loginSystem, store);

        userInterface.loadInterface();

    }
}
