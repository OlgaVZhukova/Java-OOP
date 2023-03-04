package Homework1.SubClasses;

import Homework1.ChildClasses.Drink;

public class Milk extends Drink {
    private final double percentFat;
    private final String expiryDate;
    public Milk(String productName, double price, int amount, String unit, double percentFat, String expiryDate) {
        super(productName, price, amount, unit, volume);
        this.percentFat = percentFat;
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return String.format("%s\nPercent of fat: %s\nExpiry Date: %s", super.toString(), this.percentFat, this.expiryDate);
    }
}
