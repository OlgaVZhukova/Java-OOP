package Homework2.Animals.WildAnimals;

public class Tiger implements WildAnimals{
    public Tiger(int height, double weight, String eyesColor, String habitat, String dateDiscovery) {
        super(height, weight, eyesColor, habitat, dateDiscovery);
    }

    public void makeSound() {
        System.out.println("Рыыырррррыыррыр");
    }

    public void printAnimalInfo() {
        System.out.println("\nTiger");
        System.out.printf("Eyes color: %s\n", this.eyesColor);
        System.out.printf("Height: %s\n", this.height);
        System.out.printf("Weight: %.3f\n", this.weight);
        System.out.printf("Habitat: %s\n", this.habitat);
        System.out.printf("Date of finding: %s\n", this.dateDiscovery);
    }
}
