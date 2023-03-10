package Homework3;

import Homework3.Interfaces.GetArea;
import Homework3.Interfaces.GetPerimeter;

public abstract class Figure implements GetArea, GetPerimeter {

    public String getInfo(Figure obj) {
        String result = String.format("%s\nS: %.2f", obj.getClass().getSimpleName(), obj.getArea());
        return result;
    }
    
        @Override
        public abstract double getArea();

        @Override
        public abstract double getPerimeter();
}
