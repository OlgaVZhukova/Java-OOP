package Homework2.Animals;

import Homework2.Interfaces.PrintAnimalInfo;
import Homework2.Interfaces.MakeSound;

public abstract class Animals implements MakeSound, PrintAnimalInfo {
    protected int height;
    protected double weight;
    protected String eyesColor;

    protected Animals(int height, double weight, String eyesColor) {
        this.height = height;
        this.weight = weight;
        this.eyesColor = eyesColor;
    }
    protected Animals() {
    }
    @Override
    public abstract void makeSound();
    @Override
    public abstract void printAnimalInfo();
}
