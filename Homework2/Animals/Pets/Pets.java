package Homework2.Animals.Pets;

public abstract class Pets {
    protected int height;
    protected double weight;
    protected String eyesColor;
    public String name;
    public String breed;
    public boolean vaccinations;
    public String woolColor;
    public String birthday;

    protected Pets(int height, double weight, String eyesColor, String name, String breed, boolean vaccinations, String woolColor, String birthday) {
        this.height = height;
        this.weight = weight;
        this.eyesColor = eyesColor;
        this.name = name;
        this.breed = breed;
        this.vaccinations = vaccinations;
        this.woolColor = woolColor;
        this.birthday = birthday;
    }
}
