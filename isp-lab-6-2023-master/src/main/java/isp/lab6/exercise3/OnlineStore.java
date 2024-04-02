package isp.lab6.exercise3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class OnlineStore {
    private List<Product> products = new ArrayList<>();
    private Map<String, ActiveSesion> newHashMap;
    private Map<String, ActiveSesion> sessions = newHashMap ;

    public void addSession(String username) {
       sessions.put(username, new ActiveSesion(username));
    }


}