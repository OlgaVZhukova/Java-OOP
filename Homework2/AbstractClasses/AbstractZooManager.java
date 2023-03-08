package Homework2.AbstractClasses;

import Homework2.Interfaces.Parameters.GetIndex;
import Homework2.Interfaces.ZooManager.*;
import java.io.BufferedReader;

public abstract class AbstractZooManager implements MakeAllSounds, MakeSound, PrintAllInfo, PrintInfo, AddAnimal, GetIndex, DeleteAnimal {
    protected AnimalCreator creator;
    protected AbstractZoo zoo;
    protected BufferedReader reader;
}
