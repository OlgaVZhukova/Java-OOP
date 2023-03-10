package Homework3;

import java.util.ArrayList;
import Homework3.Figures.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Figure> figures = new ArrayList<>();
        figures.add(new Circle(10));
        //figures.add(new Rectangle(10, 12));
        //figures.add(new Triangle(10,10 ,10));
        //figures.add(new Square(10));

        for (Figure figure : figures) {
            Program.getFigureInfo(figure);
            System.out.println();
        }
    }
}
