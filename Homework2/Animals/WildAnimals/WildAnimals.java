package Homework2.Animals.WildAnimals;

import Homework2.Animals.*;

public abstract class WildAnimals extends Animals {
    protected String habitat;
    protected String dateDiscovery;

    protected WildAnimals(int height, double weight, String eyesColor, String habitat, String dateDiscovery) {
        super(height, weight, eyesColor);
        this.habitat = habitat;
        this.dateDiscovery = dateDiscovery;
    }  
}
