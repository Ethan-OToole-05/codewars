package com.pluralsight;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        //link: https://www.codewars.com/kata/5412509bd436bd33920011bc
        System.out.println(maskify("64607935616"));
    }

    public static String maskify(String str) {
        int length = str.length();

        if (length < 4) {
            return str;
        } else {
            char[] input = str.toCharArray();

            for (int i = 0; i < length - 4; i++) {
                input[i] = '#';
            }

            StringBuilder sb = new StringBuilder();

            for (char ch : input) {
                sb.append(ch);
            }

            return sb.toString();
        }
    }

}
