package Homework3.Figures;

import Homework3.Exceptions.*;

public class Triangle extends Polygon {
    protected int[] sides;

    public Triangle(int a, int b, int c) throws NegativeValueException, IncorrectTriangleException {
        super(new int[] { a, b, c });

    }

    public Triangle() throws NegativeValueException, IncorrectTriangleException {
        this(3, 4, 5);
    }

    @Override
    public double getArea() {
        double p = getPerimeter() / 2;
        double side1 = sides[0];
        double side2 = sides[1];
        double side3 = sides[2];
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }

    @Override
    public String toString() {
        return String.format("Треугольник\nСторона a: %d\nСторона b: %d\nСторона c: %d", sides[0], sides[1], sides[2]);
    }
}
