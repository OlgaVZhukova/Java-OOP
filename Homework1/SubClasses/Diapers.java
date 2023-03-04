package Homework1.SubClasses;

import Homework1.ChildClasses.HygieneItems;

public class Diapers extends HygieneItems {
    private final String size;
    private final double minWeight;
    private final double maxWeight;
    private final String type;
    public Diapers(String productName, double price, int amount, String unit, int quantityPerPack, String size, double minWeight,  double maxWeight, String type) {
        super(productName, price, amount, unit, quantityPerPack);
        this.size = size;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format("%s\nSize: %s\nMin weight: %f\nMax weight: %f\nSex type: %s", super.toString(), this.size, this.minWeight, this.maxWeight, this.type);
    }
}
