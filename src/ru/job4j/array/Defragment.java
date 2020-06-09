package ru.job4j.array;


    public class Defragment {
        public static String[] compress(String[] array) {
            for (int index = 0; index < array.length - 1; index++) {
                if (array[index] == null) {
                    int point = index; /* указатель на null ячейку. */
                    /* переместить первую не null ячейку. Нужен цикл. */
                    System.out.print(point + "- ");
                } else {
                    int point1 = index;
                    System.out.print(point1 + "+ ");
                }

            }
            return array;
        }

        public static void main(String[] args) {
            String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
            String[] compressed = compress(input);
            System.out.println();
            for (int index = 0; index < compressed.length; index++) {
                System.out.print(compressed[index] + " ");
            }
        }

    }