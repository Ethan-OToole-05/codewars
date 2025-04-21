package com.pluralsight;

public class CountSheepApp {
    public static void main(String[] args) {

    }
    public static int countSheeps(Boolean[] arrayOfSheeps) {
        int count = 0;
        for (Boolean sheep : arrayOfSheeps) {
            if(sheep == null) {
                continue;
            }
            else if(sheep == true) {
                count++;
            }
            else {
                continue;
            }
        }
        return count;
    }
}
