package ua.edu.ucu.apps.lab7.flower;
import java.util.ArrayList;
import java.util.List;

public class FlowerBucket {

    private List<FlowerPack> flowerPacks = new ArrayList<>();
    
    public void addToBucket(FlowerPack flowerPack) {
        flowerPacks.add(flowerPack);
    }

public double getPrice() {
    double totalPrice = 0;

    for (int i = 0; i < flowerPacks.size(); i++) {
        FlowerPack pack = flowerPacks.get(i);
        totalPrice += pack.getPrice();
    }
    return totalPrice;
}
}