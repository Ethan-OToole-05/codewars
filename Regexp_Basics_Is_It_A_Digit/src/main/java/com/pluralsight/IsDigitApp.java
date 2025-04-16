package com.pluralsight;



public class IsDigitApp {
    public static boolean isDigit(String s) {
        if (s.isEmpty()) {
            return false;
        }
        try {
            int check = 0;
            check = Integer.parseInt(s);

            if (check > 9 || check < 0) {
                return false;
            } else {
                return true;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
    public static void main(String[] args) {
        boolean check = isDigit("1ae45");
        System.out.println(check);
    }
}
