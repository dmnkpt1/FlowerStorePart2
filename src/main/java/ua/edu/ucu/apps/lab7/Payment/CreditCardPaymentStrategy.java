package ua.edu.ucu.apps.lab7.Payment;

public class CreditCardPaymentStrategy implements Payment {
    @Override
    public boolean pay(double amount) {
        System.out.println("Pay " + amount + " by Credit Card");
        return true;
    }
}