package ru.job4j.array;

public class Min {
    public static int findMin(int[] array) {
        int min = array[0];
        for (int index = 0; index < array.length - 1; index++) {
            min = min <= array[index + 1] ? min : array[index + 1];

            /* проверить, что эталон больше, чем элемент. записать в эталон элемент массива. */
        }
        return min;
    }
}
