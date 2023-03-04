package Homework1.SubClasses;

import Homework1.ChildClasses.Food;

public class Eggs extends Food {
    private final int quantityPerPack;
    public Eggs(String productName, double price, int amount, String unit, String expiryDate, int quantityPerPack) {
        super(productName, price, amount, unit, expiryDate);
        this.quantityPerPack = quantityPerPack;
    }

    @Override
    public String toString() {
        return String.format("%s\nКоличество в упаковке: %s", super.toString(), this.quantityPerPack);
    }
}
