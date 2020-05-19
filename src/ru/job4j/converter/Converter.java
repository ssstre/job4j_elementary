package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }
    public static float rubleToDollar(float value) {
        float rsl1 = value / 60;
        return rsl1;
    }

    public static void main(String[] args) {
        float expected = 2;
        float euro = Converter.rubleToEuro(140);
        boolean passed = expected == euro;
        System.out.println("140 rubles are " + euro + " euro. Test result : " + passed);

        double expectedD = 2;
        double dollar = Converter.rubleToDollar(120);
        boolean passedD = expected == dollar;
        System.out.println("140 rubles are " + dollar + " dollar. Test result : " + passedD);
    }
}
