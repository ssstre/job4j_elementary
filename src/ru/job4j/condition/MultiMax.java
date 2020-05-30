package ru.job4j.condition;

public class MultiMax {
    public static  int max(int first, int second, int third) {
        int rsl1 = first >= second ? first : second;
        return rsl1 >= third ? rsl1 : third;
    }
}
