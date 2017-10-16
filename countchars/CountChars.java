import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.HashMap;


public class CountChars {
    public static void main(String[] args) {
        // Create a function that takes the filepath (e.g. "da_vinci_code.txt") as an input, reads the given file, and counts the occurences of 0, 1 and x characters in it.
        // The function should return a dictionary in which the searched characters are the keys and the number of their occurences are the values.
        // Use the uploaded da_vinci_code.txt file in this folder in the repo to test your program.
        // For example:
        //
         Map<String, Integer> countedLetters = countLetters("da_vinci_code.txt");
        // System.out.println("0 occured " + countedLetters.get("0") + " times in the file.");
        // System.out.println("1 occured " + countedLetters.get("1") + " times in the file.");
        // System.out.println("x occured " + countedLetters.get("x") + " times in the file.");
        //
        // Should print:
        // 0 occured 3393 times in the file.
        // 1 occured 3375 times in the file.
        // x occured 3232 times in the file.
    }

    public static Map <String,Integer> countLetters(String path){

        Map<String,Integer> charFreq = new HashMap<String,Integer>();
        try {
            Path filePath = Paths.get(fileName);
            List<String> lines = Files.readAllLines(filePath);
            numberOfLines = lines.size();
        } catch (IOException ex) {
            return 0;
        }
        return numberOfLines;
    }

    }


}
