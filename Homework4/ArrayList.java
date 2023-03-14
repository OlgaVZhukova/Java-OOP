package Homework4;

public class ArrayList<T> {
    private static final int startLength = 1;
    private int length;
    private T[] data;

    public ArrayList() {
        this.length = 0;
        this.data = (T[]) new Object[startLength];
    }

    public ArrayList(T[] data) {
        this.length = data.length;
        this.data = data;
    }

    public int getLength() {
        return this.length;
    }

    public T[] getData() {
        return this.data;
    }

    // TO DO: Печать массива

    // TO DO: Вставка в массив

    // TO DO: Удаление по индексу

    // TO DO: Удаление элемента по значению
}
