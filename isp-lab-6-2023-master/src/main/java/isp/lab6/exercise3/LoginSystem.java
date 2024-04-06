package isp.lab6.exercise3;

import java.util.HashSet;
import java.util.Set;

public class LoginSystem {
    private Set<User> users=new HashSet<>();
    private  OnlineStore store;
    public  void setStore(OnlineStore store)
    {
        this.store=store;

    }
    public  boolean login(String username,String password)
    {
        return users.stream()
                .filter(u -> u != null && u.getPassword() != null && u.getUsername() != null
                        && u.getPassword().equals(password) && u.getUsername().equals(username))
                .findFirst()
                .map(u -> {
                    store.addSession(username);
                    return true;
                })
                .orElse(false);
    }
    public boolean logout(String username) {
        if (store.getSessions(username) != null) {
            store.removeSession(username);
            return true;
        }
        return false;
    }
    public boolean register(String username, String password) {
        if (username == null || password == null) {
            return false;
        }
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return false; // Username already taken
            }
        }

        User newUser = new User(username, password);
        users.add(newUser);
        return true;
    }


}
