package ua.edu.ucu.apps.lab7.flower;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter


public class Flower implements Item {
    @Getter @Setter
    private double sepalLength;
    @Setter
    private FlowerColor color;
    @Setter
    private double price;
    @Getter @Setter
    private FlowerType flowerType;

    public Flower(FlowerColor color, double price, double sepalLength, FlowerType flowerType) {
        this.color = color;
        this.price = price;
        this.sepalLength = sepalLength;
        this.flowerType = flowerType;
    }

	public String getColor() {
        return color.toString();
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return "Flower: " + flowerType + ", Color: " + getColor() + ", Price: " + price;
    }
}
