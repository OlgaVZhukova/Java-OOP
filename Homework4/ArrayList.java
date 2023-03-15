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

    public void printArray() {
        System.out.print("[");
        for (int i = 0; i < this.getLength(); i++) {
            if (i != this.getLength() - 1)
                System.out.print(this.data[i] + ",");
            else
                System.out.print(this.data[i]);
        }
        System.out.print("]\n");
    }

    // TO DO: Вставка в массив

    // TO DO: Удаление по индексу

    // TO DO: Удаление элемента по значению
}
