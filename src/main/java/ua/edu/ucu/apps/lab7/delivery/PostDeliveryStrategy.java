package ua.edu.ucu.apps.lab7.delivery;

public class PostDeliveryStrategy implements Delivery {
    @Override
    public boolean deliver(String address) {
        System.out.println("Post delivery to address: " + address);
        return true;
    }
}