package Homework2.Animals.WildAnimals;

public class Wolf implements WildAnimals{
    private boolean alpha;

    public Wolf(int height, double weight, String eyesColor, String habitat, String dateDiscovery, boolean alpha) {
        super(height, weight, eyesColor, habitat, dateDiscovery);
        this.alpha = alpha;
    }
}
