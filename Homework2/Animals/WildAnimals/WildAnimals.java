package Homework2.Animals.WildAnimals;


public abstract class WildAnimals {
    protected int height;
    protected double weight;
    protected String eyesColor;
    public String habitat;
    public String dateDiscovery;

    protected WildAnimals(int height, double weight, String eyesColor, String habitat, String dateDiscovery) {
        this.height = height;
        this.weight = weight;
        this.eyesColor = eyesColor;
        this.habitat = habitat;
        this.dateDiscovery = dateDiscovery;
    }
    public abstract void makeSound();
    public abstract void printAnimalInfo();    
}
