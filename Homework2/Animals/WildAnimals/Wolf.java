package Homework2.Animals.WildAnimals;

public class Wolf implements WildAnimals{
    private boolean alpha;

    public Wolf(int height, double weight, String eyesColor, String habitat, String dateDiscovery, boolean alpha) {
        super(height, weight, eyesColor, habitat, dateDiscovery);
        this.alpha = alpha;
    }

    public void makeSound() {
        System.out.println("Аууууууууууу!");
    }

    public void printAnimalInfo() {
        System.out.println("\nWolf");
        System.out.printf("Eyes color: %s\n", this.eyesColor);
        System.out.printf("Height: %s\n", this.height);
        System.out.printf("Weight: %.3f\n", this.weight);
        System.out.printf("Habitat: %s\n", this.habitat);
        System.out.printf("Date of finding: %s\n", this.dateDiscovery);
        System.out.printf("Leader: %s\n", this.leader);
    }
}
