package ua.hilell.svatanenko.homework.hwLess9;

import java.util.Arrays;
import java.util.Scanner;

public class Transpon {
    public static void main(String[] args) {
        int n = 0;
        int m = 0;

        Scanner entrNumb = new Scanner(System.in);

        System.out.println("Введіть параметр N");
        if (entrNumb.hasNextInt()) {
            n = entrNumb.nextInt();
        } else {
            System.out.println("Wrong data!");
            System.exit(0);
        }

        System.out.println("Введіть параметр M");
        if (entrNumb.hasNextInt()) {
            m = entrNumb.nextInt();
        } else {
            System.out.println("Wrong data!");
            System.exit(0);
        }

// Заповнюємо масив
        int[][] myArray = new int[m][n];
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                myArray[i][j] = (int) (Math.random() * 101);
            }
        }
// друкуємо масив
        System.out.println("Наш масив, до транспонування - ");
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                System.out.print(myArray[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

// Транспонуємо - змінюємо рядок на стовбець, а стовбець на рядок.

        int[][] myArray2 = new int[n][m];
        for (int i = 0; i < myArray2.length; i++) {
            for (int j = 0; j < myArray2[i].length; j++) {
                myArray2[i][j] = myArray[j][i];
            }
        }
// Друкуємо транспонованний масив.
        System.out.println("Наш масив після транспонування - ");
        for (int i = 0; i < myArray2.length; i++) {
            for (int j = 0; j < myArray2[i].length; j++) {
                System.out.print(myArray2[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

