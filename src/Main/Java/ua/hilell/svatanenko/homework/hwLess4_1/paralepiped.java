package ua.hilell.svatanenko.homework.hwLess4_1;

public class paralepiped {
    public static void main(String[] args) {

        int a = 10;
        int b = 15;
        int c = 20;
        int volume = a*b*c;
        int length = (a*4)+(b*4)+(c*4);
        char cc = '\u33A4';
        System.out.println("Обчислюємо об'єм та сумарну довжину всіх сторін паралелепіпеда");
        System.out.println("Довжини сторін параллелепіпеда: а = 10см, в = 15см, с = 20см.");
        System.out.println("Об'єм параллелепіпеда = " + volume + cc);
        System.out.println("Сумма довжини всіх 12 сторін (ребер) параллелепіпеда = " + length + "см.");

    }
}