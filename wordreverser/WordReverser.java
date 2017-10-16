import java.util.ArrayList;

public class WordReverser {

    public static void main(String[] args) {
        // Create a function that takes a sentence as an input, reverses the letters in every word (but not reverses the words order in the sentence), and returns the sentence with the reversed words.
        // You shouldn't care about upper or lower case letters.
        // Example:

             String reversedWords = reverseWords("lleW ,enod taht saw ton taht drah");
             System.out.println(reversedWords);
            //
            // Should print:
            // Well done, that was not that hard
    }

    public static String reverseWords(String s){  //Reversing words

        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse = reverse + s.charAt(i);
        }
        return reverse;

    }

}
