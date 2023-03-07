package Homework2.Animals.Birds;

import Homework2.Animals.Animals;

public abstract class Bird implements Animals{
    public final int flightHeight;

    public Bird(int height, double weight, String eyesColor, int flightHeight) {
        super(height, weight, eyesColor);
        this.flightHeight = flightHeight;
    }

    @Override
    public void flight(){
        System.out.printf("Я лечу на %d метрах", this.flightHeight);
    }
}
