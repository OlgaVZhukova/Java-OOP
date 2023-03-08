package Homework2.Zoo;

import Homework2.AbstractClasses.AnimalParamCreator;

import Homework2.AbstractClasses.AnimalParamCreator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ZooAnimalParamCreator extends AnimalParamCreator {
    private final BufferedReader reader;

    public ZooAnimalParamCreator() {
        this.reader = new BufferedReader(new InputStreamReader(System.in));
    }

    @Override
    public String getName(String type) throws IOException {
        System.out.printf("Введите %s кличку.\n", type);
        return reader.readLine();
    }

    @Override
    public String getBreed(String type) throws IOException {
        System.out.printf("Введите %s породу.\n", type);
        return reader.readLine();
    }

    @Override
    public String getBirthday(String type) throws IOException {
        System.out.printf("Введите %s дату рождения.\n", type);
        return reader.readLine();
    }

    @Override
    public String getWoolColor(String type) throws IOException {
        System.out.printf("Введите %s цвет шерсти.\n", type);
        return reader.readLine();
    }

    @Override
    public String getEyesColor(String type) throws IOException {
        System.out.printf("Введите %s цвет глаз.\n", type);
        return reader.readLine();
    }

    @Override
    public String getHabitat(String type) throws IOException {
        System.out.printf("Введите %s среду обитания.\n", type);
        return reader.readLine();
    }

    @Override
    public String getDateDiscovery(String type) throws IOException {
        System.out.printf("Введите %s дату обнаружения.\n", type);
        return reader.readLine();
    }

    @Override
    public int getHeight(String type) throws IOException {
        System.out.printf("Введите %s рост.\n", type);
        boolean isTrue = false;
        int result = 0;
        while (!isTrue){
            result = Integer.parseInt(reader.readLine());
            if(result > 0) isTrue = true;
            else
                System.out.printf("Рост должен быть больше нуля.\nВведите %s рост.\n", type);
        }
        return result;
    }

    @Override
    public double getWeight(String type) throws IOException {
        System.out.printf("Введите %s вес.\n", type);
        boolean isTrue = false;
        double result = 0;
        while (!isTrue){
            result = Double.parseDouble(reader.readLine());
            if(result > 0) isTrue = true;
            else
                System.out.printf("Вес должен быть больше нуля.\nВведите %s вес.\n", type);
        }
        return result;
    }

    @Override
    public boolean getVaccinations(String type) throws IOException {
        System.out.printf("Этот вид %s вакцинирован?\n", type);
        boolean isTrue = false;
        String tmp = "";
        boolean result = false;
        while (!isTrue){
            tmp = reader.readLine();
            if(tmp.equals("true") || tmp.equals("false")){
                result = Boolean.parseBoolean(tmp);
                isTrue = true;
            }
            else
                System.out.printf("Статус вакцинирования true or false.\nВведите %s статус вакцинирования.\n", type);
        }
        return result;
    }

    @Override
    public boolean getTraining(String type) throws IOException {
        System.out.printf("Этот %s дрессирован?\n", type);
        boolean isTrue = false;
        String tmp = "";
        boolean result = false;
        while (!isTrue){
            tmp = reader.readLine();
            if(tmp.equals("true") || tmp.equals("false")){
                result = Boolean.parseBoolean(tmp);
                isTrue = true;
            }
            else
                System.out.printf("Статус дрессированности должен быть true or false.\nВведите %s статус дрессированности.\n", type);
        }
        return result;
    }

    @Override
    public boolean getAlpha(String type) throws IOException {
        System.out.printf("Этот %s вожак стаи.\n", type);
        boolean isTrue = false;
        String tmp = "";
        boolean result = false;
        while (!isTrue){
            tmp = reader.readLine();
            if(tmp.equals("true") || tmp.equals("false")){
                result = Boolean.parseBoolean(tmp);
                isTrue = true;
            }
            else
                System.out.printf("Статус вожака должен быть true or false.\nВведите %s статус вожака.\n", type);
        }
        return result;
    }

    @Override
    public boolean getWoolPresence(String type) throws IOException {
        System.out.printf("Введите %s наличие шерсти.\n", type);
        boolean isTrue = false;
        String tmp = "";
        boolean result = false;
        while (!isTrue){
            tmp = reader.readLine();
            if(tmp.equals("true") || tmp.equals("false")){
                result = Boolean.parseBoolean(tmp);
                isTrue = true;
            }
            else
                System.out.printf("Статус наличия шерсти должен быть true or false.\nВведите %s статус наличия шерсти.\n", type);
        }
        return result;
    }

    @Override
    public int getFlightHeight(String type) throws IOException {
        System.out.printf("Введите %s высоту полета.\n", type);
        boolean isTrue = false;
        int result = 0;
        while (!isTrue){
            result = Integer.parseInt(reader.readLine());
            if(result > 0) isTrue = true;
            else
                System.out.printf("Высота полета должна быть больше нуля.\nВведите %s место в зоопарке.\n", type);
        }
        return result;
    }
}
