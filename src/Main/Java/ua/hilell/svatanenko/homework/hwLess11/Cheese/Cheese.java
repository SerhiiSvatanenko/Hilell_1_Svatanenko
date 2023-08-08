package ua.hilell.svatanenko.homework.hwLess11.Cheese;

public class Cheese {
    String bun;
    int qttMeat;
    String meat;
    String meat2;
    String cheese;
    String green;
    String mayo;
    String smt;

    Cheese (String bun, String meat, String cheese, String green, String mayo ) {
        System.out.println("Звичайний Бургер, складається з - "+bun+ ", " + meat+ ", " +cheese+", "+green+", "+mayo+".");
    }

     Cheese (String bun, String meat, String cheese, String green) {
        System.out.println("Дієтичний Бургер, складається з - "+bun+ ", " + meat+ ", " +cheese+", "+green+".");
    }

    Cheese (String bun, String meat2, String meat, String cheese, String green, String mayo, String smt) {
        System.out.println("Бургер з Подвійним м'ясом, складається з - "+bun+ ", " +meat2+"+" + meat+ ", " +cheese+", "+green+", "+mayo+smt+".");
    }

//    Cheese (String bun, int qttMeat, String meat, String cheese, String green, String mayo, String smt) {
//        System.out.println("Бургер з Подвійним м'ясом, складається з - "+bun+ ", " + qttMeat+" " + meat+ ", " +cheese+", "+green+", "+mayo+smt+".");
//    }
}
