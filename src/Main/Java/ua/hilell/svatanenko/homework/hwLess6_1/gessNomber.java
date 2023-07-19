package ua.hilell.svatanenko.homework.hwLess6_1;

import java.util.Scanner;

public class gessNomber {
    public static void main(String[] args) {

        int i = 0;
        int randomNumber = (int) (Math.random() * 11);
        System.out.println("Комп'ютер загадав число  - " + randomNumber + "," + " але нікому не кажи про нього!");
        System.out.println("Введіть число від 0 до 10 та натисніть Enter");
        System.out.println("Маєте 3 спроби вгадати число яке загадав ПК");

        int userNumb = -1;
        while (i <= 3) {
            Scanner scan = new Scanner(System.in);
            if (scan.hasNextDouble()) {
                userNumb = scan.nextInt();
            }
            i = i + 1;
            if (randomNumber == userNumb) {
                System.out.println("Win! Win!");
                break;
            } else if (i == 3) {
                System.out.println("Наступного разу пощастить!");
                break;
            } else {
                System.out.println("Ще спроба.");
            }
        }
    }
}


