package Homework2.Animals.Birds;

public class Hen extends Bird {
    public Hen(int height, double weight, String eyesColor, int flightHeight) {
        super(height, weight, eyesColor, flightHeight);
    }

    public void makeSound() {
        System.out.println("Ко-ко-ко, куд-кудак!");
    }

    public void printAnimalInfo() {
        System.out.println("\nHen");
        System.out.printf("Eyes color: %s\n", this.eyesColor);
        System.out.printf("Height: %s\n", this.height);
        System.out.printf("Weight: %.3f\n", this.weight);
        System.out.printf("Flight's height: %s\n", this.flightHeight);
    }
}
