package Homework2.Zoo;

import Homework2.Animals.*;
import Homework2.AbstractClasses.AbstractZoo;

public class Zoo extends AbstractZoo {
    public Animals[] getZoo() {
        return zoo;
    }

    private Animals[] zoo;

    public Zoo(){
        this.zoo = new Animals[10];
    }

    @Override
    public void addAnimal(int index, Animals animal){
        if(index < 0) index = 0;

        int size = (this.zoo.length-1 >= index)? this.zoo.length+1: index+1;
        Animals[] tmp = new Animals[size];

        for (int i = 0; i < tmp.length; i++) {
            if(i<index){
                tmp[i] = this.zoo[i];
            } else if (i == index) {
                tmp[i] = animal;
            }else 
                tmp[i] = this.zoo[i-1];
        }
        this.zoo = tmp;
    }

    public void addAnimal(Animals animal){
        this.addAnimal(0,animal);
    }

    @Override
    public void delAnimal(int index){
        if(index > this.zoo.length-1){
            System.out.println("Index out of bonds");
            return;
        }
        Animals[] tmp = new Animals[this.zoo.length-1];

        for (int i = 0; i < this.zoo.length; i++) {
            if(i<index)
                tmp[i] = zoo[i];
            else if (i>index)
                tmp[i-1] = zoo[i];
        }
        this.zoo = tmp;
    }
}
