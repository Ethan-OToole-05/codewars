package com.pluralsight;

//Kata Link: https://www.codewars.com/kata/635a7827bafe03708e3e1db6/solutions/java

public class App {
    public static void main(String[] args) {
        int[] signals = {140, 130, 100};
        System.out.println(speedLimit(130, signals));
    }

    public static int speedLimit(final int speed, final int[] signals) {
        int fine = 0;
        for(int i = 0; i < signals.length; i++) {
            int difference = speed - signals[i];
            if(difference < 0) {
                fine += 0;
            }
            else if(difference <= 19 && difference >= 10) {
                fine += 100;
            } else if (difference <= 29 && difference >= 20) {
                fine += 250;
            } else if (difference >= 30) {
                fine += 500;
            }
            else {
                fine += 0;
            }
        }
        return fine;
    }
}
