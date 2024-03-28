package isp.lab5.exercise2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise2Test {
    @Test
    public void testChargeAndBatteryLevel() {
        Laptop laptop = new Laptop(30);
        SmartPhone smartPhone = new SmartPhone(10);
        SmartWatch smartWatch = new SmartWatch(5);

        laptop.charge(20);
        assertEquals(50, laptop.getBatteryLevel());

        smartPhone.charge(15);
        assertEquals(25, smartPhone.getBatteryLevel());

        smartWatch.charge(10);
        assertEquals(15, smartWatch.getBatteryLevel());
    }
}

