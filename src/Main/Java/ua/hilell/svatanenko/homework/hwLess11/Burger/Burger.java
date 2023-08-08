package ua.hilell.svatanenko.homework.hwLess11.Burger;

public class Burger {
    String bun;
    String meat;
    String meat2;
    String cheese;
    String green;
    String mayo;
    String smt;

    Burger(String bun, String meat, String cheese, String green, String mayo) {
        System.out.println("Звичайний Бургер, складається з - " + bun + ", " + meat + ", " + cheese + ", " + green + ", " + mayo + ".");
    }

    Burger(String bun, String meat, String cheese, String green) {
        System.out.println("Дієтичний Бургер, складається з - " + bun + ", " + meat + ", " + cheese + ", " + green + ".");
    }

    Burger(String bun, String meat2, String meat, String cheese, String green, String mayo, String smt) {
        System.out.println("Бургер з Подвійним м'ясом, складається з - " + bun + ", " + meat2 + " + " + meat + ", " + cheese + ", " + green + ", " + mayo + smt + ".");
    }
}

