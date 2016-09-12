import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by John on 6/7/2016.
 */
public class Problem022 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        List<String> text = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(new File("D:\\Documents\\Java_Workspace" +
                    "\\ProjectEuler\\src\\p022_names.txt")).useDelimiter("[\",]+");
            while (scanner.hasNext())
                text.add(scanner.next());
            Collections.sort(text);
        } catch (FileNotFoundException e) {
            System.out.println("Didn't find your file. Shits on fire yo.");
        }

        int sum = 0;
        for (int i = 0; i < text.size(); i++) {
            int valueOfChars = 0;
            for (int j = 0; j < text.get(i).length(); j++) {
                valueOfChars += text.get(i).charAt(j) - 'A' + 1;
            }
            sum += valueOfChars * (i + 1);
        }

        System.out.println("Total score of all names in file: " + sum + ".");

        long end = System.currentTimeMillis();
        System.out.println("Total Runtime: " + (end - start) + " milliseconds.");
    }
}
