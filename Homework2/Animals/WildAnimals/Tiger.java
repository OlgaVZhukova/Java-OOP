package Homework2.Animals.WildAnimals;

public class Tiger extends WildAnimals{
    public Tiger(int height, double weight, String eyesColor, String habitat, String dateDiscovery) {
        super(height, weight, eyesColor, habitat, dateDiscovery);
    }

    public Tiger(){
        super(200, 210, "Желтые", "Африка", "22.08.1999");
    }

    @Override
    public void makeSound() {
        System.out.println("Рыыырррррыыррыр");
    }

    @Override
    public void printAnimalInfo() {
        System.out.println("\nTiger");
        System.out.printf("Eyes color: %s\n", this.eyesColor);
        System.out.printf("Height: %s\n", this.height);
        System.out.printf("Weight: %.3f\n", this.weight);
        System.out.printf("Habitat: %s\n", this.habitat);
        System.out.printf("Date of Discovery: %s\n", this.dateDiscovery);
    }
}
