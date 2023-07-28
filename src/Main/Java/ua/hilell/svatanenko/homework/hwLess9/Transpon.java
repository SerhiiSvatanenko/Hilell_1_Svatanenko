package ua.hilell.svatanenko.homework.hwLess9;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Scanner;

public class Transpon {
    public static void main(String[] args) {
        int N = 0;
        int M = 0;
        int[][] array = new int[N][M];
        Scanner entrNumb = new Scanner(System.in);
        System.out.println("Введіть параметр N");
        N = entrNumb.nextInt();
        System.out.println("Введіть параметр M");
        M = entrNumb.nextInt();

// Заповнюємо масив
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][i] = (int) (Math.random() * 101);
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
//        System.out.println("Значення N - " + N);
//        System.out.println("Значення M - " + M);


    }
}
