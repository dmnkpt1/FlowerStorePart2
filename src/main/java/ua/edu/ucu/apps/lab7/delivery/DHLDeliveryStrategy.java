package ua.edu.ucu.apps.lab7.delivery;

public class DHLDeliveryStrategy implements Delivery {
    @Override
    public boolean deliver(String address) {
        System.out.println("DHL delivery to address: " + address);
        return true;
    }
}