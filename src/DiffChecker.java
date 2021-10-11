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
        LinkedList<String> originalText = null;
        try {
            originalText = new LinkedList<>(reader.getCMDText(oText, "original"));
        } catch (Exception e) {
            System.out.println("Error reading original file");
            e.printStackTrace();
        }

        //get Changed/New Text
        LinkedList<String> newText = null;
        try {
            newText = new LinkedList<>(reader.getCMDText(changedText, "changed"));
        } catch (Exception e) {
            System.out.println("Error reading changed file");
            e.printStackTrace();
        }


        //get diff
        System.out.println("Diff:");
        if ((newText != null) && (originalText != null)) {
            System.out.println(checkDiff(originalText, newText));
        }
        else {
            System.out.println("Error in files");
        }
    }

    /**
     * Compares 2 texts and returns the combined texts and their differences
     * @param originalText -> original text
     * @param newText -> changed text
     * @return -> combined text showing the changes made
     */
    public static StringBuilder checkDiff(LinkedList<String> originalText, LinkedList<String> newText) {
        StringBuilder textToReturn = new StringBuilder();
        do {
            if ((!newText.isEmpty()) && (originalText.peekFirst().equals(newText.peekFirst()))) {
                textToReturn.append(originalText.pollFirst());
                newText.pollFirst();
            }
            else {
                //see if the word was deleted
                if(!newText.contains(originalText.peekFirst())) {
                    textToReturn.append("[");
                    textToReturn.append(originalText.pollFirst());
                    textToReturn.append("]");
                }
                else {
                    textToReturn.append(originalText.pollFirst());
                }

                if (!newText.isEmpty()) {
                    textToReturn.append("(");
                    textToReturn.append(newText.pollFirst());
                    textToReturn.append(")");
                }
            }
        } while(!originalText.isEmpty());

        if(!newText.isEmpty()) {
            while (!newText.isEmpty()) {
                textToReturn.append("(");
                textToReturn.append(newText.pollFirst());
                textToReturn.append(")");
            }
        }
        return textToReturn;
    }
}
