package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }
    public static int rubleToDollar(int value) {
        int rsl1 = value / 60;
        return rsl1;
    }

    public static void main(String[] args) {
        int expected = 2;
        int euro = Converter.rubleToEuro(140);
        boolean passed = expected == euro;
        System.out.println("140 rubles are " + euro + " euro. Test result : " + passed);

        int expectedD = 2;
        int dollar = Converter.rubleToDollar(120);
        boolean passedD = expected == dollar;
        System.out.println("140 rubles are " + dollar + " dollar. Test result : " + passedD);
    }
}
