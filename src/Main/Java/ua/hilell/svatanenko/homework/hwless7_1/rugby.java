package ua.hilell.svatanenko.homework.hwless7_1;

import java.util.Arrays;

public class rugby {
    public static void main(String[] args) {
        int[] team1 = new int[25];
        int[] team2 = new int[25];

        int midlSumTeam1 = 0;
        int midlSumTeam2 = 0;

        for (int i = 0; i < team1.length; i++) {
            team1[i] = ((int) (Math.random() * 19) + 21);
        }
        System.out.println("Team 1 array - " + Arrays.toString(team1));

        for (int i = 0; i < team2.length; i++) {
            team2[i] = ((int) (Math.random() * 19) + 21);
        }
        System.out.println("Team 2 array - " + Arrays.toString(team2));

        int sumTeam1 = 0;
        for (int i = 0; i < team1.length; i++) {
            sumTeam1 = sumTeam1 + team1[i];
            midlSumTeam1 = sumTeam1 / team1.length;

            int sumTeam2 = 0;
            for (int j = 0; j < team2.length; j++) {
                sumTeam2 = sumTeam2 + team2[i];
                midlSumTeam2 = sumTeam2 / team2.length;
            }
        }
        System.out.println("Midl sum age Team 1 - " + midlSumTeam1);
        System.out.println("Midl sum age Team 2 - " + midlSumTeam2);
    }
}