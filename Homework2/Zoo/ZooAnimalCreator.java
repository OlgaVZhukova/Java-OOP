package Homework2.Zoo;

import Homework2.AbstractClasses.AnimalCreator;
import Homework2.AbstractClasses.AnimalParamCreator;
import Homework2.Animals.Pets.*;
import Homework2.Animals.Birds.*;
import Homework2.Animals.WildAnimals.*;

import java.io.IOException;

public class ZooAnimalCreator extends AnimalCreator {
    public ZooAnimalCreator(AnimalParamCreator paramCreator) {
        this.paramCreator = paramCreator;
    }

    @Override
    public Cat getCat() throws IOException {
        Cat cat = new Cat(this.paramCreator.getHeight("cat"),
                this.paramCreator.getWeight("cat"),
                this.paramCreator.getEyesColor("cat"),
                this.paramCreator.getName("cat"),
                this.paramCreator.getBreed("cat"),
                this.paramCreator.getVaccinations("cat"),
                this.paramCreator.getWoolColor("cat"),
                this.paramCreator.getBirthday("cat"),
                this.paramCreator.getWoolPresence("cat"));
        return cat;
    }

    @Override
    public Dog getDog() throws IOException {
        Dog dog = new Dog(this.paramCreator.getHeight("dog"),
                this.paramCreator.getWeight("dog"),
                this.paramCreator.getEyesColor("dog"),
                this.paramCreator.getName("dog"),
                this.paramCreator.getBreed("dog"),
                this.paramCreator.getVaccinations("dog"),
                this.paramCreator.getWoolColor("dog"),
                this.paramCreator.getBirthday("dog"),
                this.paramCreator.getTraining("dog"));
        return null;
    }

    @Override
    public Hen getHen() throws IOException {
        Hen hen = new Hen(this.paramCreator.getHeight("hen"),
                this.paramCreator.getWeight("hen"),
                this.paramCreator.getEyesColor("hen"),
                0);
        return hen;
    }

    @Override
    public Stork getStork() throws IOException {
        Stork stork = new Stork(this.paramCreator.getHeight("stork"),
                this.paramCreator.getWeight("stork"),
                this.paramCreator.getEyesColor("stork"),
                this.paramCreator.getFlightHeight("stork"));
        return stork;
    }

    @Override
    public Tiger getTiger() throws IOException {
        Tiger tiger = new Tiger(this.paramCreator.getHeight("tiger"),
                this.paramCreator.getWeight("tiger"),
                this.paramCreator.getEyesColor("tiger"),
                this.paramCreator.getHabitat("tiger"),
                this.paramCreator.getDateDiscovery("tiger"));
        return tiger;
    }

    @Override
    public Wolf getWolf() throws IOException {
        Wolf wolf = new Wolf(this.paramCreator.getHeight("wolf"),
                this.paramCreator.getWeight("wolf"),
                this.paramCreator.getEyesColor("wolf"),
                this.paramCreator.getHabitat("wolf"),
                this.paramCreator.getDateDiscovery("wolf"),
                this.paramCreator.getAlpha("wolf"));
        return wolf;
    }
}
