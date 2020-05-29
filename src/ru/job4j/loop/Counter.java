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


}
