package isp.lab6.exercise3;

import java.util.HashMap;
import java.util.Map;

public class ActiveSesion {
    private String username;
    private Map<Product,Integer> shoppingCart=new HashMap<>();

    public ActiveSesion(String username) {
        this.username = username;
    }
    public  void addToCart(Product product,Integer quantity)
    {
        shoppingCart.put(product,quantity);
    }

}
