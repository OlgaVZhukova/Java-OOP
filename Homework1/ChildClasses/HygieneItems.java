package Homework1.ChildClasses;

import Homework1.Product;

public class HygieneItems extends Product {
    private final int quantityPerPack;
    public HygieneItems(String productName, double price, int amount, String unit, int quantityPerPack) {
        super(productName, price, amount, unit);
        this.quantityPerPack = quantityPerPack;
    }

    @Override
    public String toString() {
        return String.format("%s\nQuantityPerPack: %s", super.toString(), this.quantityPerPack);
    }
}
