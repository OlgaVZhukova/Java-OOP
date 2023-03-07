package Homework2.Animals.Pets;

public class Dog implements Pets{
    private boolean training;
    public boolean getTraining(){return this.training;}

    @Override
    public void showFondling() {
        System.out.println("I am happy dog!!! Auuu!!!");
    }
}
