package com.pluralsight;

public class App {
    public static void main(String[] args) {
        Object[] array = {2, 4, 5, 2};
        System.out.println(printArray(array));
    }

    public static String printArray(Object[] array) {
        StringBuilder output = new StringBuilder();
        if (array == null || array.length == 0) {
            return "";
        }
        output.append(array[0]);
        for (int i = 1; i < array.length; i++) {
            if (array[i] != null) {
                output.append(",").append(array[i]);
            }
        }
        return output.toString();
    }
}
