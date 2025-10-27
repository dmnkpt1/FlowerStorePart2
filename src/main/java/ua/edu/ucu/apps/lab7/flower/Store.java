package ua.edu.ucu.apps.lab7.flower;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<FlowerBucket> buckets = new ArrayList<>();
    
    public void addBucket(FlowerBucket bucket) {
        buckets.add(bucket);
    }

    public List<FlowerBucket> search(double maxPrice) {
        List<FlowerBucket> result = new ArrayList<>();

        for (int i = 0; i < buckets.size(); i++) {
            FlowerBucket bucket = buckets.get(i);
            if (bucket.getPrice() <= maxPrice) {
                result.add(bucket);
            }
        }
        return result;
    }
}