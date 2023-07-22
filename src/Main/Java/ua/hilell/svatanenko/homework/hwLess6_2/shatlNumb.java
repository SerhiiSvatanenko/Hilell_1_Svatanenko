package ua.hilell.svatanenko.homework.hwLess6_2;

public class shatlNumb {
    public static void main(String[] args) {
//        int counter = 1;
//        int shatNumb = 0;
//
//        while (counter <= 100) {
//            for (int i = 1; i < 100; i++) {
//                if (i / 10 == 4 || i / 10 == 9 || i % 10 == 4 || i % 10 == 9) {
//                    continue;
//                }
//                System.out.println(i);
//                //counter++;
//            }
//            int part1 = 0;
//            for (int j = 101; j < 899; j++) {
//                part1 = j;
//                int part2 = part1 % 100;
//                int part3 = part2 / 10;
//                int part4 = part2 % 10;
//                if (part1 == 4 || part2 == 4 || part3 == 4 || part4 == 4 || part1 == 9 || part2 == 9 || part3 == 9 || part4 == 9)
//                    continue;
//                System.out.println(part1);
//                //counter++;
//            }
//            counter++;
//            if (counter == 100){
//                break;
//            }
//        }
//
//        System.out.println("counter - " + counter);
//    }
//
//}

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
