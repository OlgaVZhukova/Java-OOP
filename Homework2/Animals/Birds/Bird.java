package Homework2.Animals.Birds;

import Homework2.Interfaces.Flight;
import Homework2.Animals.*;

public abstract class Bird extends Animals implements Flight {
    protected int flightHeight; // public final

    public Bird(int height, double weight, String eyesColor, int flightHeight) {
        super(height, weight, eyesColor);
        this.flightHeight = flightHeight;
    }

    @Override
    public void flight(){
        System.out.printf("Я лечу на %d метрах", this.flightHeight);
    }
}
