package Homework3;

import Homework3.Figures.*;
//import Homework3

public class Program {
    public static void main(String[] args)
            throws NegativeValueException, IncorrectTriangleException {

        FiguresArray storage = new FiguresArray();

        Square square = new Square(5);
        Rectangle rectangle = new Rectangle(5, 7);
        Triangle triangle = new Triangle(3, 4, 5);
        Circle circle = new Circle(7);
        Square sq = new Square();

        storage.add(square);
        storage.add(rectangle);
        storage.add(triangle);
        storage.add(circle);
        storage.add(sq);

        storage.remove(0);
        storage.sort();
        storage.showFigures();
        storage.showAll();
    }
}
