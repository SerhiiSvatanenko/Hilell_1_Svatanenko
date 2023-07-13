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
        Scanner scanner1 = new Scanner(System.in);
        int fragUs1 = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        int fragUs2 = scanner2.nextInt();
        Scanner scanner3 = new Scanner(System.in);
        int fragUs3 = scanner3.nextInt();
        Scanner scanner4 = new Scanner(System.in);
        int fragUs4 = scanner4.nextInt();
        Scanner scanner5 = new Scanner(System.in);
        int fragUs5 = scanner5.nextInt();

        System.out.println("Чудово! Продовжимо. ");
        System.out.println("Введіть назву для Другої команди та натисніть Enter.");
        Scanner scanner11 = new Scanner(System.in);
        String teamName2 = scanner11.nextLine();
        System.out.println("Введіть кількість отриманних фрагів кожним з 5ти гравців команди - ");
        System.out.println(teamName2 + " та натисніть Enter.");
        System.out.println("Після введення кількості фрагів для кожного гравця, натискай Enter");
        Scanner scanner6 = new Scanner(System.in);
        int fragUs6 = scanner6.nextInt();
        Scanner scanner7 = new Scanner(System.in);
        int fragUs7 = scanner7.nextInt();
        Scanner scanner8 = new Scanner(System.in);
        int fragUs8 = scanner8.nextInt();
        Scanner scanner9 = new Scanner(System.in);
        int fragUs9 = scanner9.nextInt();
        Scanner scanner10 = new Scanner(System.in);
        int fragUs10 = scanner10.nextInt();

        int resultTeam1 = (fragUs1 + fragUs2 + fragUs3 + fragUs4 + fragUs5) / 5;
        int resultTeam2 = (fragUs6 + fragUs7 + fragUs8 + fragUs9 + fragUs10) | 5;
        System.out.println("Кількість балів у команди - " + teamName1 + " " + " " + resultTeam1 + ".");
        System.out.println("Кількість балів у команди - " + teamName2 + " " + " " + resultTeam2 + ".");

        // порівняння балів в командах
        String teamName;
        int result = 0;
        if (resultTeam1 > resultTeam2) {
            result = resultTeam1;
            teamName = teamName1;

        } else {
            result = resultTeam2;
            teamName = teamName2;
        }

        System.out.println("Перемогла команда - " + teamName + " яка набрала - " + result + " балів.");
        System.out.println("До нових зустрічей!");
        System.exit(0);

    }
}
