package ua.edu.ucu.apps.lab7;

import org.junit.jupiter.api.Test;

import ua.edu.ucu.apps.lab7.Payment.CreditCardPaymentStrategy;
import ua.edu.ucu.apps.lab7.Payment.PayPalPaymentStrategy;

import static org.junit.jupiter.api.Assertions.*;

public class PaymentTest {

    @Test
    public void testCreditCardPayment() {
        CreditCardPaymentStrategy payment = new CreditCardPaymentStrategy();
        assertTrue(payment.pay(100.0));
    }

    @Test
    public void testPayPalPayment() {
        PayPalPaymentStrategy payment = new PayPalPaymentStrategy();
        assertTrue(payment.pay(50.0));
    }
}