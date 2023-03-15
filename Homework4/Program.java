package Homework4;

public class Program {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(37); // добавление элемента
        intList.add(47);
        intList.add(27);
        intList.add(55);
        intList.add(87);
        intList.add(12);
        intList.add(51);
        intList.add(12);
        intList.add(12);
        intList.add(12);
        intList.add(88);
        intList.add(2);
        intList.printArray(); // печать масива
        intList.remForIdx(5); // удаление элемента по индексу
        intList.remForIdx(5);
        intList.printArray();
        intList.removeData(12); // удаление элемента по значению
        intList.removeData(88);
        intList.printArray();
        System.out.println(intList.minData()); // Поиск минимального значения
        System.out.println(intList.maxData()); // Поиск максимального значения
        System.out.println(intList.sumData()); // Сумма элементов массива
        System.out.println(intList.multData()); // Произведение элементов массива
        System.out.println(intList.findIDX(87)); // Поиск элемента по индексу (если его нет то возвращает -1)
        System.out.println(intList.findData(874)); // Проверка наличия элемента в массиве. Возвращает true, если элемент в массиве есть, false – нет.

        // TO DO: Пузырьковая сортировка

        // TO DO: печать



        
    }
}
