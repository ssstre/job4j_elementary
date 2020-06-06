package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        for (int temp = 0; temp < array.length / 2; temp++) {
            int temp1 = array[temp];
            array[temp] = array[array.length - 1 - temp];
            array[array.length - 1 - temp] = temp1;
        }
        return array;
    }
  }
