package Homework3;

public abstract class Figure { //TO DO: дописать implements методы посчитать периметр и посчитать площадь фигуры
    /*public abstract double getArea();

    public String getInfo(Figure obj) {
        String result = String.format("%s\nS: %.2f", obj.getClass().getSimpleName(), obj.getArea());
        return result;*/
        public String figureName;
        public double lengthSide;
    
        public Figure(String figureName, double lengthSide) {
            this.figureName = figureName;
            this.lengthSide = lengthSide;
        }
    
        public Figure() {
        }
    
        @Override
        public String toString() {
            return String.format("Фигура: %s\nДлина стороны: %.2f", this.figureName, this.lengthSide);
        }
}
