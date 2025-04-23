package com.pluralsight;

import java.util.Arrays;

public class CatDogYearsApp {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(ownedCatAndDog(7, 7)));

    }
    public static int[] ownedCatAndDog(final int catYears, final int dogYears) {
        int inputDog = dogYears;
        int dogHuman = 0, catHuman =0;
        int inputCat = catYears;
        int humanAge = 0;
        if(inputDog >= 1) {
            dogHuman = 15;
        }
        if (inputDog >= 2) {
            dogHuman = 24;
        }
        while(inputDog <= dogYears) {
            dogHuman += 5;
            inputDog++;
        }
        if(inputCat >= 1) {
            catHuman = 15;
        }
        if(inputCat >= 2) {
            catHuman = 24;
        }
        while (inputCat <= catYears) {
            catHuman += 4;
            inputCat++;
        }
        dogHuman = (int) dogHuman / 12;
        catHuman = (int) catHuman / 12;
        int[] years = {dogHuman, catHuman};
        return years;
    }
}
