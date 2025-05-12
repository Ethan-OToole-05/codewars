import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("abcdef")));
        System.out.println(Arrays.toString(solution("abcde")));
    }

    public static String[] solution(String s) {
        //get the length of the input string. get the length of our array we will create as well.
        //Also keep track of our index goign through the array.
        int length = s.length(), arrayLength = 0, index = 0;

        //If the string input is even then we split the length by 2.
        if (length % 2 == 0) {
            arrayLength = length / 2;
        }
        //If the string is odd then we will add one to the length and then divide the length by 2.
        else {
            arrayLength = (length + 1) / 2;
        }

        //This will be our parts to return based on arrayLength.
        String[] parts = new String[arrayLength];

        //We will loop through the input string and increment by 2 for each pair.
        for (int i = 0; i < length; i += 2) {
            //Check if the next character can form a pair. Store the pair in parts.
            if (i + 1 < length) {
                parts[index] = s.substring(i, i + 2);
            }
            //If there is no character than we know we reached the last character.
            else {
                parts[index] = s.substring(i) + "_";
            }
            //Increment the index by one to move to the next position.
            index++;
        }

        //We will then return the parts array containing each pair.
        return parts;
    }
}
