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

    public void add(T element) {
        if (this.length == this.data.length) {
            addLenth();
        }
        this.data[this.length++] = element;
    }

    private void addLenth() {
        int newlen = this.getLength() + 1;
        T[] newData = (T[]) new Object[newlen];
        for (int i = 0; i < this.getLength(); i++) {
            newData[i] = this.data[i];
        }
        this.data = newData;
    }

    // TO DO: Удаление по индексу

    // TO DO: Удаление элемента по значению
}
