package ua.hilell.svatanenko.homework.hwless_10;

public class Person {
    public static void main(String[] args) {
        personinfo("Денис ", "Лонжанський ", "Київ", "+380998998777");
        personinfo("Костянтин ", "Бондаренко ", "Одеса", "+380657773338");
        personinfo("Олександр ", "Долгих ", "Вінниця", "+830788881122");
    }

    static void personinfo(String name, String sname, String sity, String tel) {
        System.out.println("Зателефонувати громадянинові " + name + sname + "з міста" + sity + " можна за номером " + tel);
    }
}
