import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class CmdLineReader {
    public LinkedList<String> getCMDText(File inputFile, String originalOrChanged) throws Exception {
        LinkedList<String> toReturn = new LinkedList<>();
        try {
            Scanner sc = new Scanner(inputFile);
            StringBuilder text = new StringBuilder();
            while (sc.hasNext()) {
                //add to printed text
                String nextWord = sc.next();
                text.append(nextWord);
                text.append(" ");

                //add to linked list
                toReturn.add(nextWord);
                toReturn.add(" ");
            }
            System.out.println("Input " + originalOrChanged + " Text:" + text);
            return toReturn;
        } catch (FileNotFoundException fileNotFoundException) {
            throw new Exception();
        }
    }

}
