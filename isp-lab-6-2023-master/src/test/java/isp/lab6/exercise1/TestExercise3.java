package isp.lab6.exercise3;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static org.junit.Assert.assertEquals;

public class TestExercise3 {

    @Test
    public void testGetProducts() {
        Product product1 = new Product("Product 1", 10.99);
        Product product2 = new Product("Product 2", 15.49);
        Product product3 = new Product("Product 3", 5.99);

        List<Product> expectedProducts = new ArrayList<>();
        expectedProducts.add(product1);
        expectedProducts.add(product2);
        expectedProducts.add(product3);

        OnlineStore store = new OnlineStore();

        store.setProducts(expectedProducts);

        List<Product> actualProducts = store.getProducts();

        assertEquals(expectedProducts, actualProducts);
    }
    @Test
    public void testAddToCart() {
        Product product = new Product("Product 1", 10.99);

        OnlineStore store = new OnlineStore();

        String username = "test";
        store.addSession(username);

        int quantity = 1;
        store.addToCart(username, product, quantity);

        Map<Product, Integer> shoppingCart = store.getSessions(username).get(username).getshoppingCart();

        assertEquals(1, shoppingCart.size());
        assertEquals(Optional.of(quantity),shoppingCart.get(product));
    }
}
