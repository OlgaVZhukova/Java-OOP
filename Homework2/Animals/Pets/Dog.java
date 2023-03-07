package Homework2.Animals.Pets;

public class Dog implements Pets{
    private boolean training;
    public boolean getTraining(){return this.training;}

    //@Override
    public void showFondling() {
        System.out.println("Я счастливый пёс!");
    }

    public void makeSound() {
        System.out.println("Гав! Гав! Гав!");
    }

    public void printAnimalInfo() {
        System.out.println("\nDog");
        System.out.printf("Name: %s\n", this.name);
        System.out.printf("Breed: %s\n", this.breed);
        System.out.printf("Birthday: %s\n", this.birthday);
        System.out.printf("Wool color: %s\n", this.woolColor);
        System.out.printf("Eyes color: %s\n", this.eyesColor);
        System.out.printf("Height: %d\n", this.height);
        System.out.printf("Weight: %.3f\n", this.weight);
        System.out.printf("Vaccinations: %b\n", this.vaccinations);
        System.out.printf("Training: %b\n", this.training);
    }
}
