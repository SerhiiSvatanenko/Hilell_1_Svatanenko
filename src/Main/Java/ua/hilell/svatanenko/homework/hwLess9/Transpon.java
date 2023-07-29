package ua.hilell.svatanenko.homework.hwLess9;

import java.util.Arrays;
import java.util.Scanner;

public class Transpon {
    public static void main(String[] args) {
        int n = 0;
        int m = 0;
        Scanner entrNumb = new Scanner(System.in);
        System.out.println("Введіть параметр N");
        n = entrNumb.nextInt();
        System.out.println("Введіть параметр M");
        m = entrNumb.nextInt();

// Заповнюємо масив
        int[][] myArray = new int[n][m];
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                myArray[i][j] = (int) (Math.random() * 101);
            }
        }
// друкуємо масив
        System.out.println("Наш масив, до транспонування - ");
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray.length; j++) {
                System.out.print(myArray[i][j] + "\t");
            }
            System.out.println();
        }
//        System.out.println("Значення N - " + N);
//        System.out.println("Значення M - " + M);


    }
}
