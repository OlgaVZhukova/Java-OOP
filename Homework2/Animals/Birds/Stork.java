package Homework2.Animals.Birds;


public class Stork extends Bird {
    public Stork(int height, double weight, String eyesColor, int flightHeight) {
        super(height, weight, eyesColor, flightHeight);
    }

    public Stork() {
        super(70, 2, "Серый", 100);
    }

    @Override
    public void makeSound() {
        System.out.println("Тктктк тктктктк тктктктктк");
    }

    @Override
    public void printAnimalInfo() {
        System.out.println("\nStork");
        System.out.printf("Eyes color: %s\n", this.eyesColor);
        System.out.printf("Height: %s\n", this.height);
        System.out.printf("Weight: %.3f\n", this.weight);
        System.out.printf("Flight's height: %s\n", this.flightHeight);
    }

    @Override
    public void showFondling() {
        System.out.println("Мне нравится эта крыша, совью-ка я тут гнездо!");
    }
}
