package Homework2.Animals.WildAnimals;

public interface WildAnimals {
    public static String habitat;
    public static String dateDiscovery;

    public WildAnimal(int height, double weight, String eyesColor, String habitat, String dateDiscovery) {
        //super(height, weight, eyesColor);
        this.habitat = habitat;
        this.dateDiscovery = dateDiscovery;
    }
}
