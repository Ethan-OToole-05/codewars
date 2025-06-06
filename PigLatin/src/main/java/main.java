public class main {

    public static void main(String[] args) {
        System.out.println(pigIt("Pig latin is cool"));
    }

    public static String pigIt(String str) {

        //Link: https://www.codewars.com/kata/520b9d2ad5c005041100000f/java

        if (str.isEmpty()) {
            System.exit(0);
        }

        String input = str, pigLatinText, movingLetter, result = "";

        String[] inputWords = input.split(" ");

        for (String inputWord : inputWords) {
            if (inputWord.contains("!") || inputWord.contains("?")) {
                continue;
            }
            pigLatinText = inputWord;
            movingLetter = pigLatinText.substring(0, 1);
            pigLatinText = pigLatinText.substring(1) + movingLetter + "ay";
            result = result + pigLatinText + " ";
        }
        return result.trim();
    }
}
