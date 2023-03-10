package Homework3.Figures;

import Homework3.Figure;

public class Circle extends Figure {
    private double radius;

    public String getArea(Figure obj) {
        String result = String.format("%s\nS: %.2f", obj.getClass().getSimpleName(), obj.getArea());
        return result;
}
