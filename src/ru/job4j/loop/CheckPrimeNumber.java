package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean p = true;   ///Задаем что переменная число  простое
        int num = 2;
        while (num < number) {

            if ((number % num) == 0) { // если число делется без остатка на любое число кроме 1 и number то число не простое

                p = false;
            break;
            }
            num++;


        }
        return p; // выводим результат
    }

}
