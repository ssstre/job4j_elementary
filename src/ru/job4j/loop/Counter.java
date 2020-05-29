package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int st = start; st <= finish; st++) {
            sum = sum + st;
        }
        return sum;
    }
        public static int sumByEven(int start, int finish) {
            int sum = 0;
            for (int st1 = start; st1 <= finish; st1++) {
                if (st1 % 2 == 0) {
                    sum = sum + st1;
                }
            }
            return sum;
        }

        public static void main(String[] args) {
            System.out.println(sum(0, 10));
            System.out.println(sum(3, 8));
            System.out.println(sum(1, 1));

            System.out.println(sumByEven(0, 10));
            System.out.println(sumByEven(3, 8));
            System.out.println(sumByEven(1, 1));
        }
}
