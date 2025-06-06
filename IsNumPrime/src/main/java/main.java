public class main {

    //Link: https://www.codewars.com/kata/5262119038c0985a5b00029f/java

    public static void main(String[] args) {
        System.out.println(isPrime(3));
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(num); i += 2) { //Increment by 2 to only check odd numbers.
            if (num % i == 0) {
                return false; //If it's divisible by another number it is false.
            }
        }
        return true;
    }
}
