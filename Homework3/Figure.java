package Homework3;

public abstract class Figure {
    /*public abstract double getArea();

    public String getInfo(Figure obj) {
        String result = String.format("%s\nS: %.2f", obj.getClass().getSimpleName(), obj.getArea());
        return result;*/
        public String figureName;
        public int lengthSide;
    
        public Figure(String figureName, int lengthSide) {
            this.figureName = figureName;
            this.lengthSide = lengthSide;
        }
    
        public Figure() {
        }
    
        @Override
        public String toString() {
            return String.format("Фигура: %s\nДлина стороны: %d", this.figureName, this.lengthSide);
        }
}
