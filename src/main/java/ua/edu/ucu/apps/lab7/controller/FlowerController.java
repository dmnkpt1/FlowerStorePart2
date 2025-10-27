package ua.edu.ucu.apps.lab7.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ua.edu.ucu.apps.lab7.delivery.Delivery;
// import ua.edu.ucu.apps.lab7.Payment.CreditCardPaymentStrategy;
// import ua.edu.ucu.apps.lab7.Payment.PayPalPaymentStrategy;
// import ua.edu.ucu.apps.lab7.Payment.Payment;
import ua.edu.ucu.apps.lab7.delivery.DHLDeliveryStrategy;
import ua.edu.ucu.apps.lab7.delivery.PostDeliveryStrategy;
import ua.edu.ucu.apps.lab7.flower.Flower;
import ua.edu.ucu.apps.lab7.flower.FlowerColor;
import ua.edu.ucu.apps.lab7.flower.FlowerType;


@RestController
public class FlowerController {
    
    @GetMapping("/flowers")
    public List<Flower> getFlowers() {
        return List.of(
            new Flower(FlowerColor.RED, 100, 10, FlowerType.TULIP)
        );
    }

    @GetMapping("/delivery/dhl")
    public String deliverDHL(@RequestParam String address) {
        Delivery delivery = new DHLDeliveryStrategy();
        boolean success = delivery.deliver(address);
        if (success) {
            return "DHL delivery to: " + address;
        } else {
            return "DHL delivery failed";
        }
    }
    
    @GetMapping("/delivery/post") 
    public String deliverPost(@RequestParam String address) {
        Delivery delivery = new PostDeliveryStrategy();
        boolean success = delivery.deliver(address);
        if (success) {
            return "Post delivery to: " + address;
        } else {
            return "Post delivery failed";
        }
    }
}
