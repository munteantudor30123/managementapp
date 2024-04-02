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


}
