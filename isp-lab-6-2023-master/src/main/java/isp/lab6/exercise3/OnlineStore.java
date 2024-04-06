package isp.lab6.exercise3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class OnlineStore {
    private List<Product> products = new ArrayList<>();
    private Map<String, ActiveSesion> newHashMap;
    private Map<String, ActiveSesion> sessions = newHashMap ;
    public List<Product> getProducts() {
        return products;
    }
    public List<Product> getProductsSorted(Comparator<Product> sortCriteria) {
        List<Product> sortedProducts = new ArrayList<>(products);
        sortedProducts.sort(sortCriteria);
        return sortedProducts;
    }
    public void removeSession(String username) {
        sessions.remove(username);
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void addToCart(String username, Product product, int quantity) {
        ActiveSesion session = sessions.get(username);
        if (session != null) {
            session.addToCart(product, quantity);
        }
    }

    public String checkout(String username) {
        ActiveSesion session = sessions.get(username);
        if (session != null) {
            return session.checkout();
        }
        return "User session not found.";
    }

    public void addSession(String username) {
       sessions.put(username, new ActiveSesion(username));
    }

    public Map<String, ActiveSesion> getSessions(String username) {
        return sessions;
    }

    public void setSessions(Map<String, ActiveSesion> sessions) {
        this.sessions = sessions;
    }


}