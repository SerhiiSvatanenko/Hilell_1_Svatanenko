package ua.hilell.svatanenko.homework.hwLess6_2;

public class shatlNumb {
    public static void main(String[] args) {

        int counter = 1;
        int part1 = 0;

        for (int j = 1; counter <= 99; j++) {
            part1 = j;
            int part2 = part1 % 100;
            int part5 = part1 / 100;
            int part3 = part2 / 10;
            int part4 = part2 % 10;

            if (part5 == 4 || part5 == 9 || part1 == 4 || part2 == 4 || part3 == 4 || part4 == 4 || part1 == 9 || part2 == 9 || part3 == 9 || part4 == 9)
                continue;
            System.out.println(part1);
            counter++;
        }
        System.out.println("counter - " + counter);
    }
}
