package Homework2.Animals.Pets;

public interface Pets {
    public String name;
    public String breed;
    public boolean vaccinations;
    public String woolColor;
    public String birthday;
    public void showFondling();

    public Pets(int height, double weight, String eyesColor, String name, String breed, boolean vaccinations, String woolColor, String birthday) {
        super(height, weight, eyesColor);
        this.name = name;
        this.breed = breed;
        this.vaccinations = vaccinations;
        this.woolColor = woolColor;
        this.birthday = birthday;
    }
}
