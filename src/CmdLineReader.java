import java.util.LinkedList;
import java.util.Scanner;

public class CmdLineReader {
    public LinkedList<Character> getCMDText() {
        LinkedList<Character> toReturn = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Text:");
        int i = 0;
        while(sc.hasNext()) {
            toReturn.add(sc.next().charAt(i));
            i++;
        }
        return toReturn;
    }

}
