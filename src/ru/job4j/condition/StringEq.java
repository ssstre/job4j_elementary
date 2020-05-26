package ru.job4j.condition;

public class StringEq {
    public static boolean chek(String login) {
        String root = new String("root");
        boolean access = root.equals(login);
        return access;
    }

    public static void main(String[] args) {
        String your = "your_name";
        boolean userHasAccess = StringEq.chek(your);
        System.out.println(userHasAccess);
    }
}
