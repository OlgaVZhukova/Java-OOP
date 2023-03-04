package Homework1.SubClasses;

import Homework1.ChildClasses.Drink;

public class Lemonade extends Drink {
    public Lemonade(String productName, double price, int amount, String unit, double volume) {
        super(productName, price, amount, unit, volume);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
