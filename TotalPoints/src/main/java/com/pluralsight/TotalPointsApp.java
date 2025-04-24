package com.pluralsight;

public class TotalPointsApp {
    public static void main(String[] args) {
        String[] scores = {"1:0", "2:0", "0:2", "3:3", "6:0"};
//        points(scores);
        System.out.println("Total Points: " + points(scores));
    }
    public static int points(String[] games) {
        String[] inputScores = games;
        String[] scores;
        int homeScore = 0, awayScore = 0, totalPoints = 0;

        for(int i = 0; i < games.length; i++) {
            scores = inputScores[i].split(":");
            homeScore = Integer.parseInt(scores[0]);
            awayScore = Integer.parseInt(scores[1]);
            if(homeScore > awayScore) {
                totalPoints += 3;
            }
            else if(homeScore == awayScore) {
                totalPoints += 1;
            }
            else {
                continue;
            }
        }
        return totalPoints;
    }
}
