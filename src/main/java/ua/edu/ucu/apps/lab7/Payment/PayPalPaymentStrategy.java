package ua.edu.ucu.apps.lab7.Payment;

public class PayPalPaymentStrategy implements Payment {
    @Override
    public boolean pay(double amount) {
        System.out.println("Pay " + amount + "by PayPal");
        return true;
    }
}