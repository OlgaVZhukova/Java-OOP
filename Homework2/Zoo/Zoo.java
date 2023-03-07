package Homework2.Zoo;

public class Zoo {
    public Animal[] getZoo() {
        return zoo;
    }

    private Animal[] zoo;
    public Zoo(){
        this.zoo = new Animal[10];
    }
}
