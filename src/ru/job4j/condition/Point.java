package ru.job4j.condition;

public class Point {
    public static double distance(double x1, double y1, double x2, double y2) {
        double rslx = x2 - x1;
        double rsly = y2 - y1;
        double rslx2 = Math.pow(rslx, 2);
        double rsly2 = Math.pow(rsly, 2);
        double symmXY = rslx2 + rsly2;
        double rsl = Math.sqrt(symmXY);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}
