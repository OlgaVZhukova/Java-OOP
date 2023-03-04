package Homework1.SubClasses;

import Homework1.ChildClasses.HygieneItems;

public class Masks extends HygieneItems {
    public Masks(String productName, double price, int amount, String unit, int quantityPerPack) {
        super(productName, price, amount, unit, quantityPerPack);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
