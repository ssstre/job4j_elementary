package ru.job4j.condition;

public class MultiMax {
    public static  int max(int first, int second, int third) {
        int rsl1;
        rsl1 = first >= second ? first : second;
        int rsl2;
        rsl2 = first >= third ? first : third;
        int rsl;
        rsl = rsl1 >= rsl2 ? rsl1 : rsl2;
        return rsl;

    }
}
