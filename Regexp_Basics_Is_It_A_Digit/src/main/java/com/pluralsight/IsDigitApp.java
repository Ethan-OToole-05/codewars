package com.pluralsight;



public class IsDigitApp {
    public static boolean isDigit(String s) {
        s = s.trim();
        if(s.isEmpty()) {
            return false;
        }
        else if (!s.isEmpty()){
            for (int i = 0; i < s.length(); i++) {
                if(!Character.isDigit(s.charAt(i))){
                    return false;
                }
            }
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        boolean check = isDigit("14");
        System.out.println(check);
    }
}
