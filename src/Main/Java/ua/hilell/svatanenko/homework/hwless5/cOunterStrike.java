package ua.hilell.svatanenko.homework.hwless5;

import java.util.Scanner;

public class cOunterStrike {
    public static void main(String[] args) {
        System.out.println("Гра починається!");
        System.out.println("Введіть назву для Першої команди та натисніть Enter.");
        Scanner scanner = new Scanner(System.in);
        String teamName1 = scanner.nextLine();

        System.out.println("Введіть кількість отриманних фрагів кожним з 5ти гравців команди - ");
        System.out.println(teamName1 + " та натисніть Enter.");
        System.out.println("Після введення кількості фрагів для кожного гравця, натискай Enter");

        double fragUs1 = 0;
        double fragUs2 = 0;
        double fragUs3 = 0;
        double fragUs4 = 0;
        double fragUs5 = 0;

        if (scanner.hasNextInt()) {
            fragUs1 = scanner.nextDouble();
            fragUs2 = scanner.nextDouble();
            fragUs3 = scanner.nextDouble();
            fragUs4 = scanner.nextDouble();
            fragUs5 = scanner.nextDouble();
        } else {
            System.out.println("Wrong data!");
            System.exit(0);
        }

        System.out.println("Чудово! Продовжимо. ");
        System.out.println("Введіть назву для Другої команди та натисніть Enter.");
        Scanner scanner1 = new Scanner(System.in);
        String teamName2 = scanner1.nextLine();

        System.out.println("Введіть кількість отриманних фрагів кожним з 5ти гравців команди - ");
        System.out.println(teamName2 + " та натисніть Enter.");
        System.out.println("Після введення кількості фрагів для кожного гравця, натискай Enter");

        double fragUs6 = 0;
        double fragUs7 = 0;
        double fragUs8 = 0;
        double fragUs9 = 0;
        double fragUs10 = 0;

        if (scanner.hasNextInt()) {
             fragUs6 = scanner.nextDouble();
             fragUs7 = scanner.nextDouble();
             fragUs8 = scanner.nextDouble();
             fragUs9 = scanner.nextDouble();
             fragUs10 = scanner.nextDouble();
        } else {
            System.out.println("Wrong data!");
            System.exit(0);
        }

        double resultTeam1 = (fragUs1 + fragUs2 + fragUs3 + fragUs4 + fragUs5) / 5;
        double resultTeam2 =(fragUs6 + fragUs7 + fragUs8 + fragUs9 + fragUs10) / 5;
        System.out.println("Кількість балів у команди - " + teamName1 + " " + " " + resultTeam1 + ".");
        System.out.println("Кількість балів у команди - " + teamName2 + " " + " " + resultTeam2 + ".");

        // порівняння балів в командах
        String teamName = "someName";
        double result = 0;
        if (resultTeam1 > resultTeam2) {
            result = resultTeam1;
            teamName = teamName1;
        } else if (resultTeam1 < resultTeam2) {
            result = resultTeam2;
            teamName = teamName2;
        } else {
            System.out.println("Перемогла Дружба, бо кільсть балів у обох комманд однакова!");
            System.exit(0);
        }

        System.out.println("Перемогла команда - " + teamName + " яка набрала - " + result + " балів.");
        System.out.println("До нових зустрічей!");
        System.exit(0);

    }
}
