import java.util.LinkedList;

/**
 * Compares 2 texts and returns the combined texts and their differences
 * (char) means added
 * [char] means removed
 */

public class DiffChecker {
    public static void main(String[] args) {
        CmdLineReader reader = new CmdLineReader();

        //get Original Text
        LinkedList<Character> originalText = new LinkedList<>(reader.getCMDText());

        //get Changed/New Text
        LinkedList<Character> newText = new LinkedList<>(reader.getCMDText());

        //get diff
        StringBuilder combinedText = new StringBuilder(checkDiff(originalText, newText));

        System.out.println("Diff:");
        System.out.println(combinedText.toString());
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
