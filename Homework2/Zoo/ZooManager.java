package Homework2.Zoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Homework2.AbstractClasses.*;
import Homework2.Animals.*;

public class ZooManager extends AbstractZooManager {
    public ZooManager(AnimalCreator creator, AbstractZoo zoo) {
        this.creator = creator;
        this.zoo = zoo;
        this.reader = new BufferedReader(new InputStreamReader(System.in));
    }

    @Override
    public void makeAllSounds() {
        System.out.println("Заставить всех животных в зоопарке издать звук.");
        Animals[] animals = this.zoo.getAnimal();
        for (int i = 0; i < animals.length; i++) {
            if(animals[i] != null) {
                animals[i].makeSound();
                System.out.println();
            }
        }
        System.out.println();
    }

    @Override
    public void makeSound() throws IOException {
        System.out.println("Введите индекс животного, которму нужно издать звук.");
        this.zoo.getAnimal()[Integer.parseInt(reader.readLine())].makeSound();
    }

    @Override
    public void printAllInfo() {
        System.out.println("Показать информацию обо всех животных в зоопарке.");
        Animals[] animals = this.zoo.getAnimal();
        for (int i = 0; i < animals.length; i++) {
            if(animals[i] != null) {
                animals[i].printAnimalInfo();
                System.out.println();
            }
        }
        System.out.println();
    }

    @Override
    public void printInfo() throws IOException {
        System.out.println("Введите индекс животного, по которому нужно получить информацию.");
        this.zoo.getAnimal()[Integer.parseInt(reader.readLine())].printAnimalInfo();
    }

    @Override
    public void addAnimal(String type) throws IOException {
        switch (type){
            case ("Cat") -> this.zoo.addAnimal(getIndex(type), creator.getCat());
            case ("Dog") -> this.zoo.addAnimal(getIndex(type), creator.getDog());
            case ("Hen") -> this.zoo.addAnimal(getIndex(type), creator.getHen());
            case ("Stork") -> this.zoo.addAnimal(getIndex(type), creator.getStork());
            case ("Tiger") -> this.zoo.addAnimal(getIndex(type), creator.getTiger());
            case ("Wolf") -> this.zoo.addAnimal(getIndex(type), creator.getWolf());
        }
    }

    @Override
    public int getIndex(String type) throws IOException {
        System.out.printf("Введите %s место в зоопарке.\n", type);
        boolean isTrue = false;
        int result = 0;
        while (!isTrue){
            result = Integer.parseInt(this.reader.readLine());
            if(result >= 0) isTrue = true;
            else
                System.out.printf("Место в зоопарке должно быть больше или равно нулю.\nВведите %s место в зоопарке.\n", type);
        }
        return result;
    }

    @Override
    public void delAnimal() throws IOException {
        System.out.println("Введите индекс животного, чтобы удалить его.");
        this.zoo.delAnimal(Integer.parseInt(reader.readLine()));
    }
}
