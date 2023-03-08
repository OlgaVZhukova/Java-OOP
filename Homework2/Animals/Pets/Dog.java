package Homework2.Animals.Pets;

import Homework2.Interfaces.ToTrain;

public class Dog extends Pets implements ToTrain {
    private boolean training;
    private static int dogNamesCounter;
    static {dogNamesCounter = 1;}

    public Dog(int height, double weight, String eyesColor, String name, String breed, boolean vaccinations,
            String woolColor, String birthday, boolean training) {
        super(height, weight, eyesColor, name, breed, vaccinations, woolColor, birthday);
        this.training = training;
    }

    public Dog() {
        super(70, 15, "Синий", String.format("Dog %d", dogNamesCounter++), "cur", false, "Черный", "01.01.2020");
        this.training = false;
    }

    @Override
    public void showFondling() {
        System.out.println("Я счастливый пёс!");
    }

    @Override
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
    
    public boolean getTraining(){return this.training;}

    @Override
    public final void toTrain(boolean toTrain){
        if(this.training){
            System.out.printf("Собака по кличке %s уже дрессированная.", this.name);
        }else
            this.training = toTrain;
    }
}
