public class Main {
    /*

    Link: https://www.codewars.com/kata/5701e43f86306a615c001868/java

    | Card Type  | Begins With          | Number Length |
|------------|----------------------|---------------|
| AMEX       | 34 or 37             | 15            |
| Discover   | 6011                 | 16            |
| Mastercard | 51, 52, 53, 54 or 55 | 16            |
| VISA       | 4                    | 13 or 16      |
     */
    public static void main(String[] args) {
        System.out.println(getIssuer("6011822463100000"));
    }

    public static String getIssuer(String cardNumber) {
        if (cardNumber.length() != 13 && cardNumber.length() != 15 && cardNumber.length() != 16) {
            return "Unknown";
        }
        if (cardNumber.substring(0, 1).equals("4") && (cardNumber.length() == 13 || cardNumber.length() == 16)) {
            return "VISA";
        }
        if ((cardNumber.substring(0, 2).equals("34")
                || cardNumber.substring(0, 2).equals("37"))
                && cardNumber.length() == 15) {
            return "AMEX";
        }
        if (cardNumber.substring(0, 4).equals("6011") && cardNumber.length() == 16) {
            return "Discover";
        }
        if ((cardNumber.substring(0, 2).equals("51")
                || cardNumber.substring(0, 2).equals("52")
                || cardNumber.substring(0, 2).equals("53")
                || cardNumber.substring(0, 2).equals("54")
                || cardNumber.substring(0, 2).equals("55"))
                && cardNumber.length() == 16) {
            return "Mastercard";
        } else {
            return "Unknown";
        }
    }
}
