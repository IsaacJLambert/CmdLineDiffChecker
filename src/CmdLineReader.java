import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class CmdLineReader {
    public LinkedList<Character> getCMDText(File inputFile, String originalOrChanged) throws Exception {
        LinkedList<Character> toReturn = new LinkedList<>();
        try {
            Scanner sc = new Scanner(inputFile);
            StringBuilder text = new StringBuilder();
            while (sc.hasNextLine()) {
                String nextLine = sc.nextLine();
                text.append(nextLine);
                for(int i = 0; i < nextLine.length(); i++) {
                    toReturn.add(nextLine.charAt(i));
                }
                text.append(" ");
                toReturn.add(' ');
            }
            System.out.println("Input " + originalOrChanged + " Text:" + text);
            return toReturn;
        } catch (FileNotFoundException fileNotFoundException) {
            throw new Exception();
        }
    }

}
