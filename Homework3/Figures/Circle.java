package Homework3.Figures;

import Homework3.Exceptions.NegativeValueException;
import Homework3.Interfaces.GetArea;
import Homework3.Interfaces.GetPerimeter;

public class Circle implements GetArea, GetPerimeter {
    private double radius;
    private double perimeter;
    private double area;
    final double PI = 3.14;

    public Circle(double radius) throws NegativeValueException {
        if (radius <= 0) throw new NegativeValueException("Radius must be more than zero");
        this.radius = radius;
    }

    public Circle() throws NegativeValueException{
        this.radius = 7;
    }

    @Override
    public double getPerimeter() {
        perimeter = this.radius * 2 * PI;
        return this.perimeter;
    }

    @Override
    public double getArea() {
        area = this.radius * this.radius * PI;
        return this.area;
    }

    @Override
    public String toString() {
        return String.format("Круг\nРадиус: %d", this.radius);
    }
}
