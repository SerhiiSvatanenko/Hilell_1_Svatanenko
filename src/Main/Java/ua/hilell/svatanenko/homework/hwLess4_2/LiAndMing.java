package ua.hilell.svatanenko.homework.hwLess4_2;

public class LiAndMing {
    public static void main(String[] args) {

// Кількість воїнів в кожній династії.
        int liWarCount = 860;
        int liArcherCount = 860;
        int liCavalCount = 860;

        double MiWarCount = liWarCount * 1.5;
        double MiArcherCount = liArcherCount * 1.5;
        double MiCavalCount = liCavalCount * 1.5;

// Показники атаки кожного типа воїнів в династіях.
        int liWarAtac = 13;
        int liArcherAtac = 24;
        int liCavalAtac = 46;

        int MiWarAtac = 9;
        int MiArcherAtac = 35;
        int MiCavalAtac = 12;

// Показники атаки по кожному типу воїнів та династіям.
        int LiWarTotal = liWarAtac * liWarCount;
        int LiArcherTotal = liArcherAtac * liArcherCount;
        int LiCavalTotal = liCavalAtac * liCavalCount;

        double MiWarTotal = MiWarAtac * MiWarCount;
        double MiArcherTotal = MiArcherAtac * MiArcherCount;
        double MiCavalTotal = MiCavalAtac * MiCavalCount;

// Сумарний паказник атаки по кожній династії.
        double LiTotalAtac = LiWarTotal + LiArcherTotal + LiCavalTotal;
        double MiTotalAtac = MiWarTotal + MiArcherTotal + MiCavalTotal;

//  Загальний показник атак армій династій.
        System.out.println("Загальний показник атаки армії династії Лі - " + LiTotalAtac);
        System.out.println("Загальний показник атаки армії династії Мінь - " + MiTotalAtac);

    }
}
