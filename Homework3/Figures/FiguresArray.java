package Homework3.Figures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Homework3.Interfaces.*;
import Homework3.Figure;

public class FiguresArray {
    private List<Figure> storage = new ArrayList<Figure>();

    public void add(Figure obj) {
        this.storage.add(obj);
    }

    public void delete(int index) {
        this.storage.remove(index);
    }

    public void showFigures() {
        for (Figure figure : storage) {
            System.out.println(figure);
            System.out.println();
        }
    }

    public void showAll() {
        for (Figure figure : storage) {
            System.out.println(figure);
            System.out.printf("Площадь: %.2f\n", ((GetArea) figure).getArea());
            if (figure instanceof Length) {
                System.out.printf("Длина окружности: %.2f\n", ((Length) figure).length());
            }
            if (figure instanceof GetPerimeter) {
                System.out.printf("Периметр: %.2f\n", ((GetPerimeter) figure).getPerimeter());
            }
            System.out.println();
        }

    }

    public void sort() {
        Collections.sort(this.storage);
    }

    public void add(Square square) {
    }

    public void add(Rectangle rectangle) {
    }

    public void add(Triangle triangle) {
    }

    public void add(Circle circle) {
    }

    public void remove(int i) {
    }
}
