package Homework2.Animals.Pets;

public class Cat implements Pets{
    private final boolean woolPresence;

    public Cat(int height, double weight, String eyesColor, String name, String breed, boolean vaccinations, String woolColor, String birthday, boolean woolPresence) {
        super(height, weight, eyesColor, name, breed, vaccinations, woolColor, birthday);
        this.woolPresence = woolPresence;
    }

    @Override
    public void showFondling() {
        System.out.println("I am happy dog!!! Auuu!!!");
    }
}
