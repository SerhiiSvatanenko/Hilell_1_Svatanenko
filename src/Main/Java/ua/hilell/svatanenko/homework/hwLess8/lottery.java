package ua.hilell.svatanenko.homework.hwLess8;

import java.util.Arrays;

public class lottery {
    public static void main(String[] args) {
        int[] userArr = new int[7];
        for (int i = 0; i < userArr.length; i++) {
            userArr[i] = ((int) (Math.random() * 10));
        }
        System.out.println("User Array    - " + Arrays.toString(userArr));

        int[] compArr = new int[7];
        for (int i = 0; i < compArr.length; i++) {
            compArr[i] = ((int) (Math.random() * 10));
        }
        System.out.println("Company Array - " + Arrays.toString(compArr));

        // сортування масивів, за спаданням.
        for (int i = 0; i < userArr.length - 1; i++) {
            for (int j = 0; j < userArr.length - 1; j++) {
                if (userArr[j] < userArr[j + 1]) {
                    int temp1 = userArr[j];
                    userArr[j] = userArr[j + 1];
                    userArr[j + 1] = temp1;
                }
            }
        }
        System.out.println("Sort Usser Array    - " + Arrays.toString(userArr));

        for (int i = 0; i < compArr.length - 1; i++) {
            for (int j = 0; j < compArr.length - 1; j++) {
                if (compArr[j] < compArr[j + 1]) {
                    int temp1 = compArr[j];
                    compArr[j] = compArr[j + 1];
                    compArr[j + 1] = temp1;
                }
            }
        }
        System.out.println("Sort Company Array  - " + Arrays.toString(compArr));

        // визначення кількості збігів.
        int consi = 0;
        for (int i = 0; i < userArr.length; i++) {
            if (userArr[i] == compArr[i]) {
                consi++;
            }
        }
        System.out.println("Number of coincidence in 2 arrays - " + consi);
    }
}
