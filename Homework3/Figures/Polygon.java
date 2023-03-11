package Homework3.Figures;
import Homework3.Interfaces.*;
import Homework3.Exceptions.*;

public abstract class Polygon implements GetArea, GetPerimeter {
    protected int[] sides;

    protected Polygon(int[] sides) throws NegativeValueException, IncorrectTriangleException {
        if (hasNegative(sides))
            throw new NegativeValueException("Value must be more than zero");
        if (sides.length == 3 && !isTriangle(sides))
            throw new IncorrectTriangleException("Triangle is incorrect");
        this.sides = sides;
    }

    @Override
    public double getPerimeter() {
        double result = 0;
        for (int side : sides) {
            result += side;
        }
        return result;
    }

    private boolean hasNegative(int[] sides) {
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
    }
}
