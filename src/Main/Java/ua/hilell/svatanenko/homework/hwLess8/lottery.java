package ua.hilell.svatanenko.homework.hwLess8;

import java.util.Arrays;

public class lottery {
    public static void main(String[] args) {
        int[] userArr = new int[7];
        for (int i = 0; i < userArr.length; i++) {
            userArr[i] = ((int) (Math.random() * 9));
        }
            System.out.println("User Array    - " + Arrays.toString(userArr));

        int[] compArr = new int[7];
        for (int i = 0; i < compArr.length; i++) {
            compArr[i] = ((int) (Math.random() * 9));
        }
            System.out.println("Company Array - " + Arrays.toString(compArr));

        }
    }
