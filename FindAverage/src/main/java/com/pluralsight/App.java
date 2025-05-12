package com.pluralsight;

public class App {
    public static void main(String[] args) {

    }

    public static double findAverage(int[] array) {
        double sum = 0, average = 0;
        for(double num : array) {
            if(num == 0) {
                continue;
            }
            else {
                sum += num;
            }
        }
        return average = sum / array.length;
    }
}
