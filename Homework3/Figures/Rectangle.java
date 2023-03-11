package OOPDraftFigures.Figures;

import OOPDraftFigures.Exceptions.*;

public class Rectangle extends Polygon {
    protected int[] sides;
    private int sideA;
    private int sideB;

    /*protected Rectangle(int[] sides) throws NegativeValueException, IncorrectTriangleException {
        if (hasNegative(sides))
            throw new NegativeValueException("Value must be more than zero");
        if (sides.length == 3 && !isTriangle(sides))
            throw new IncorrectTriangleException("Triangle is incorrect");
        this.sides = sides;
    }*/
    
    public Rectangle(int sideA, int sideB) throws NegativeValueException, IncorrectTriangleException{
        super(new int[] { sideA, sideB, sideA, sideB });
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public Rectangle() throws NegativeValueException, IncorrectTriangleException{
        this(3, 4);
    }
    
    /*private boolean hasNegative(int[] sides) {
        boolean result = false;
        for (int side : sides) {
            if (side < 0) {
                result = true;
                break;
            }
        }
        return result;
    }

    private boolean isTriangle(int[] sides) {
        if (sides[0] + sides[1] <= sides[2]
                || sides[0] + sides[2] <= sides[1]
                || sides[2] + sides[1] <= sides[0])
            return false;
        else
            return true;
    }*/

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
