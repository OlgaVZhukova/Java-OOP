package Homework2.Animals.Birds;

import Homework2.Animals.Animals;

public abstract class Bird implements Animals{
    protected int height;
    protected double weight;
    protected String eyesColor;
    public final int flightHeight;

    public Bird(int height, double weight, String eyesColor, int flightHeight) {
        this.height = height;
        this.weight = weight;
        this.eyesColor = eyesColor;
        this.flightHeight = flightHeight;
    }

    @Override
    public void flight(){
        System.out.printf("Я лечу на %d метрах", this.flightHeight);
    }
}
