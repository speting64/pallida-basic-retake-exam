import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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

    public static String reverseWords(String word){

        int length = word.length();
        String rev = "";
        String temp = "";

        for (int i = 0; i < length ; i++) { //
            temp += word.charAt(i); // Adding the letter in the
            if((word.charAt(i) == ' ') || (i == length)) {
                for (int j = temp.length()-1; j >= 0; j--) { // Reversing
                    rev += temp.charAt(j);
                    if ((j == 0) && (i != length))
                        rev += "";
                }
                temp = "";
            }
        }
        return rev;
                
    }
}


