package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {

        boolean p = number > 1;
        for (int i = 2; i < number; i++) {
            if ((number % i) == 0) { // если число делется без остатка на любое число кроме 1 и number то число не простое
                p = false;
                break;
            }
        }
        return p;// выводим результат
    }
}
