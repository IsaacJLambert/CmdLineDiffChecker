import java.io.File;
import java.util.LinkedList;

/**
 * Compares 2 texts and returns the combined texts and their differences
 * (char) means added
 * [char] means removed
 */

public class DiffChecker {
    public static void main(String[] args) {
        CmdLineReader reader = new CmdLineReader();
        File oText = new File(args[0]);
        File changedText = new File(args[1]);

        //get Original Text
        LinkedList<Character> originalText = null;
        try {
            originalText = new LinkedList<>(reader.getCMDText(oText, "original"));
        } catch (Exception e) {
            System.out.println("Error reading original file");
            e.printStackTrace();
        }

        //get Changed/New Text
        LinkedList<Character> newText = null;
        try {
            newText = new LinkedList<>(reader.getCMDText(changedText, "changed"));
        } catch (Exception e) {
            System.out.println("Error reading changed file");
            e.printStackTrace();
        }

        //get diff

        System.out.println("Diff:");
        System.out.println(checkDiff(originalText, newText));
    }

    /**
     * Compares 2 texts and returns the combined texts and their differences
     * @param originalText -> original text
     * @param newText -> changed text
     * @return -> combined text showing the changes made
     */
    public static StringBuilder checkDiff(LinkedList<Character> originalText, LinkedList<Character> newText) {
        StringBuilder textToReturn = new StringBuilder();
        int iterator = 0;
        for (Character nextChar : originalText) {
            iterator++;

        }

        return textToReturn;
    }


}
