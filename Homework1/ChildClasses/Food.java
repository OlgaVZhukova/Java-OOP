package Homework1.ChildClasses;

import Homework1.Product;

public class Food extends Product {
    private final String expiryDate;
    public Food(String productName, double price, int amount, String unit, String expiryDate) {
        super(productName, price, amount, unit);
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return String.format("%s\nBest before price: %s", super.toString(), this.expiryDate);
    }
}
