package Homework2.Animals.Pets;

import Homework2.Interfaces.GetWhool;

public class Cat extends Pets implements GetWhool {
    private final boolean woolPresence;
    private static int catNamesCounter;
    static {catNamesCounter = 1;}

    public Cat(int height, double weight, String eyesColor, String name, String breed, boolean vaccinations, String woolColor, String birthday, boolean woolPresence) {
        super(height, weight, eyesColor, name, breed, vaccinations, woolColor, birthday);
        this.woolPresence = woolPresence;
    }

    public Cat() {
        super(50, 4.3, "Зеленый", String.format("Cat %d", catNamesCounter++), "Noname", false, "black", "08.03.2022");
        this.woolPresence = true;
    }

    @Override
    public void showFondling() {
        System.out.println("Я счастливый котик!");
    }
    @Override
    public void makeSound() {
        System.out.println("Мррррр-мяу!");
    }

    public void printAnimalInfo() {
        System.out.println("\nCat");
        System.out.printf("Name: %s\n", this.name);
        System.out.printf("Breed: %s\n", this.breed);
        System.out.printf("Birthday: %s\n", this.birthday);
        System.out.printf("Wool color: %s\n", this.woolColor);
        System.out.printf("Eyes color: %s\n", this.eyesColor);
        System.out.printf("Height: %d\n", this.height);
        System.out.printf("Weight: %.3f\n", this.weight);
        System.out.printf("Vaccinations: %b\n", this.vaccinations);
        System.out.printf("Wool presence: %b\n", this.woolPresence);
    }
    @Override
    public boolean getWool(){return this.woolPresence;}
}
