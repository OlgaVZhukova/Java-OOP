package Homework3.Figures;

import Homework3.Figure;

public class Circle extends Figure {
    private double radius;
    private double perimeter;
    private double area;
    final double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
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
        return String.format("%sfigureName: %s\nРадиус: %d\nПериметр: %d\nПлощадь: %d", super.toString(), this.radius, this.perimeter, this.area);
    }
}
