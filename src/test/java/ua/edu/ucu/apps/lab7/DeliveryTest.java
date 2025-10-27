package ua.edu.ucu.apps.lab7;

import org.junit.jupiter.api.Test;

import ua.edu.ucu.apps.lab7.delivery.DHLDeliveryStrategy;
import ua.edu.ucu.apps.lab7.delivery.PostDeliveryStrategy;

import static org.junit.jupiter.api.Assertions.*;

public class DeliveryTest {

    @Test
    public void testDHLDelivery() {
        DHLDeliveryStrategy delivery = new DHLDeliveryStrategy();
        assertTrue(delivery.deliver("Kyiv"));
    }

    @Test
    public void testPostDelivery() {
        PostDeliveryStrategy delivery = new PostDeliveryStrategy();
        assertTrue(delivery.deliver("Lviv"));
    }
}