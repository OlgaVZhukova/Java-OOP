package Homework1.SubClasses;

import Homework1.ChildClasses.HygieneItems;

public class ToiletPapper extends HygieneItems {
    private final int quantityLayers;
    public ToiletPapper(String productName, double price, int amount, String unit, int quantityPerPack, int quantityLayers) {
        super(productName, price, amount, unit, quantityPerPack);
        this.quantityLayers = quantityLayers;
    }

    @Override
    public String toString() {
        return String.format("%s\nNumbers of layers: %s", super.toString(), this.quantityLayers);
    }
}
