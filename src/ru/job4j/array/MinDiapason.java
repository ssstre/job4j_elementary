package ru.job4j.array;

public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int index = start; index < finish; index++) {
            min = min <= array[index + 1] ? min : array[index + 1];

            /* проверить, что эталон больше, чем элемент. записать в эталон элемент массива. */
        }
        return min;
    }

}