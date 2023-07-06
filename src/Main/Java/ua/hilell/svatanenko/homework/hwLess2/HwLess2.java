package ua.hilell.svatanenko.homework.hwLess2;

public class HwLess2 {
    public static void main(String[] args) {
        // Завдання вивести на екран георагфічні координати
        //      свого положення або координати цікавих місць.
        // 1. Координати географічного центру Европи (EU), за одним з способів визначення.
        // 1.1 Україна, Закарпатська область, Рахівщина. (https://web.archive.org/web/20070818133448/http://www.rakhiv.com/CenterOfEurope.html)
        // 2. Координати пам'ятника "Студенту програмісту" (St).
        // 2.1 М. Харків, біля центрального входу в Харківський національний університет радіоелектроніки (https://uk.wikipedia.org/wiki/Пам%27ятник_студенту-програмісту)
        // Позначення за DMS (Degrees Minutes Seconds): Північна Широта - N, Східна Довгота - Е, Південна Широта - S, Західна Довгота - W.

        double longitudeEU = 47.934167;
        double latitudeEU = 24.191667;
        double longitudeSt = 50.014756;
        double latitudeSt = 36.228103;
        char degree = '\u00B0';

        System.out.println("Координати географічного центру Европи:");
        System.out.println(" - " + "десяткова система координат");
        System.out.println("Longitude: - " + longitudeEU + ", " + "Latitude: - " + latitudeEU);
        System.out.println(" - " + "DMS система координат");
        System.out.println("47" + degree + "56'3''" + "N" + " 24" + degree + "11'30''" + "E");
        System.out.println(" ");
        System.out.println("Координати пам'ятника Студенту програмісту:");
        System.out.println(" - " + "десяткова система координат");
        System.out.println("Longitude: - " + longitudeSt + ", " + "Latitude: - " + latitudeSt);
        System.out.println(" - " + "DMS система координат");
        System.out.println("50" + degree + "00'53.1''" + "N" + " 36" + degree + "13'41.2''" + "E");

    }
}