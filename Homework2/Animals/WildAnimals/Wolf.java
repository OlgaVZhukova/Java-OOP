package Homework2.Animals.WildAnimals;

import Homework2.Interfaces.BeAlpha;

public class Wolf extends WildAnimals implements BeAlpha {
    private boolean alpha;

    public Wolf(int height, double weight, String eyesColor, String habitat, String dateDiscovery, boolean alpha) {
        super(height, weight, eyesColor, habitat, dateDiscovery);
        this.alpha = alpha;
    }

    public Wolf() {
        super(85, 50, "Золотой", "Повсеместно", "20.08.2022");
        this.alpha = false;
    }

    @Override
    public void makeSound() {
        System.out.println("Аууууууууууу!");
    }

    @Override
    public void printAnimalInfo() {
        System.out.println("\nWolf");
        System.out.printf("Eyes color: %s\n", this.eyesColor);
        System.out.printf("Height: %s\n", this.height);
        System.out.printf("Weight: %.3f\n", this.weight);
        System.out.printf("Habitat: %s\n", this.habitat);
        System.out.printf("Date of Discovery: %s\n", this.dateDiscovery);
        System.out.printf("Alpha: %s\n", this.alpha);
    }

    public boolean getAlpha(){return this.alpha;}

    @Override
    public boolean beAlpha(Boolean alpha) {
        this.alpha = alpha;
        return alpha;
    }
}
