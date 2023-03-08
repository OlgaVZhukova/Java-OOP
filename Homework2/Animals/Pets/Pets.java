package Homework2.Animals.Pets;

import Homework2.Animals.*;
import Homework2.Interfaces.ShowFondling;

public abstract class Pets extends Animals implements ShowFondling {
    public String name;
    public String breed;
    public boolean vaccinations;
    public String woolColor;
    public String birthday;

    protected Pets(int height, double weight, String eyesColor, String name, String breed, boolean vaccinations, String woolColor, String birthday) {
        super(height, weight, eyesColor);
        this.name = name;
        this.breed = breed;
        this.vaccinations = vaccinations;
        this.woolColor = woolColor;
        this.birthday = birthday;
    }
    @Override
    public abstract void showFondling();
}
