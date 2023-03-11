package Homework3.Figures;

import Homework3.Exceptions.*;

public class Rectangle extends Polygon {
    protected int[] sides;
    private int sideA;
    private int sideB;
    
    public Rectangle(int sideA, int sideB) throws NegativeValueException, IncorrectTriangleException{
        super(new int[] { sideA, sideB, sideA, sideB });
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public Rectangle() throws NegativeValueException, IncorrectTriangleException{
        this(3, 4);
    }

    @Override
    public double getPerimeter() {
        return 2 * (sideA + sideB);
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public String toString() {
        return String.format("Прямоугольник\nСторона a: %d\nСторона b: %d", sides[0], sides[1]);
    }
}
