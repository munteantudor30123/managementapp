

package isp.lab3;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import isp.lab3.exercise5.VendingMachine;

public class VendingMachineTest {
    @Test
    public void testInsertCoin() {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.insertCoin(10);

    }
    @Test
    public void testSelectProduct() {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.insertCoin(5);
        String selectedProduct = vendingMachine.selectProduct(1);
        assertEquals("Soda", selectedProduct);
    }
}
