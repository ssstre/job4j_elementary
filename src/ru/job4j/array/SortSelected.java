package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {

            int min = MinDiapason.findMin(data, i, data.length - 1);  // ищет минимальное число в диапазоне
            int index = FindLoop.indexOf(data, min, i, data.length); //этот метод нужен, чтобы получить индекс элемента, полученного из метода MinDiapason.findMin.
            int array = data[i];
            data[i] = data[index];
            data[index] = array;
        }
        return data;
    }
}
