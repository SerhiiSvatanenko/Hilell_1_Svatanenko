package ua.hilell.svatanenko.homework.hwless_10;

import org.w3c.dom.ls.LSOutput;

public class Person {
    public static void main(String[] args) {

        personinfo("Олександр ", "Долгих ", "Вінниця", "+830788881122");
        personinfo("Денис ", "Лонжанський ", "Київ", "+380998998777");
        personinfo("Костянтин ", "Бондаренко ", "Одеса", "+380657773338");

    }

    static String personinfo(String name, String sname, String sity, String tel) {
        String txt = " Зателефонувати громадянинові " + name + sname + "з міста " + sity + " можна за номером " + tel;
        System.out.println(txt);
        return txt;
    }
}
