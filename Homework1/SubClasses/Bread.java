package Homework1.SubClasses;

import Homework1.ChildClasses.Food;

public class Bread extends Food {
    private final String flourType;
    public Bread(String productName, double price, int amount, String unit, String expiryDate, String flourType) {
        super(productName, price, amount, unit, expiryDate);
        this.flourType = flourType;
    }

    @Override
    public String toString() {
        return String.format("%s\nFlour's type: %s", super.toString(), this.flourType);
    }
}
