package ua.edu.ucu.apps.lab7.flower;

import ua.edu.ucu.apps.lab7.Payment.Payment;
import ua.edu.ucu.apps.lab7.delivery.Delivery;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Item> items = new ArrayList<>();
    private Payment payment;
    private Delivery delivery;
    
    public void addItem(Item item) {
        items.add(item);
    }
    
    public void removeItem(Item item) {
        items.remove(item);
    }
    
    public double calculateTotalPrice() {
        double total = 0;
        for (int i = 0; i < items.size(); i++) {
            Item item = items.get(i);
            total += item.getPrice();
        }
        return total;
    }
    
    public void setPaymentStrategy(Payment payment) {
        this.payment = payment;
    }
    
    public void setDeliveryStrategy(Delivery delivery) {
        this.delivery = delivery;
    }
    
    public boolean processOrder(String deliveryAddress) {
        double total = calculateTotalPrice();
        if (payment.pay(total)) {
            return delivery.deliver(deliveryAddress);
        }
        return false;
    }
    
    public List<Item> getItems() {
        return new ArrayList<>(items);
    }
}