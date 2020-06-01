/**
 * Converter
 */
package ru.job4j.converter;

/**
 * Class Converter решение задачи части 1, урок 5.
 * @author lezhnev
 * @since 20.05.2020
 */
public class Converter {
    /**
     * Метод rubleToEuro для конвектирования рублей в евро.
     * @param value переменная для ввода количества рублей.
     * @return rsl результат конвектирования в евро.
     */
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }
    /**
     * Метод rubleToDollar для конвектирования рублей в доллары
     * @param value переменная для ввода количества рублей.
     * @return rsl1 результат конвектирования в доллары.
     */
    public static int rubleToDollar(int value) {
        int rsl1 = value / 60;
        return rsl1;
    }

    /**
     * Метод для тестирования методов rubleToEuro и rubleToDollar
     * Main
     * @param args - args
     */
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
