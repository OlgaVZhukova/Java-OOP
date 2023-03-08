package Homework2.AbstractClasses;

import Homework2.Interfaces.GetAnimal.*;

public abstract class AnimalCreator implements GetCat, GetDog, GetHen, GetStork, GetTiger, GetWolf{
    protected AnimalParamCreator paramCreator;
}
