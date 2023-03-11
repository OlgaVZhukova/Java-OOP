package Homework3;

import Homework3.Interfaces.GetArea;
import Homework3.Interfaces.GetPerimeter;

public abstract class Figure implements Comparable<Figure>, GetArea, GetPerimeter {
    
    public String getInfo(Figure obj) {
        String result = String.format("%s\nS: %.2f", obj.getClass().getSimpleName(), obj.getArea());
        return result;
    }
    
        public Figure(int[] is) {
    }

    @Override
    public abstract double getArea();

    @Override
    public abstract double getPerimeter();

    @Override
    public int compareTo(Figure obj) {
        if (this.getArea() > obj.getArea()) return 1;
        else if (this.getArea() < obj.getArea()) return -1;
        else return 0;
    }
}
