import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Problem22 {

    private static int totalNamesScore;
    private static int nameNumber;
    private static int nameScore;
    private static ArrayList<String> namesList = new ArrayList<String>();

    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
        Scanner in = new Scanner(new File("names.txt"));
        String str = in.next();
        in.close();
        String[] names = str.split(",");
        for (int i = 0; i < names.length; i++) {
            namesList.add(names[i]);
        }
        Collections.sort(namesList);

        for (int i = 0; i < namesList.size(); i++) {
            nameNumber = i + 1;
            nameScore(namesList.get(i));
        }
        System.out.println(totalNamesScore);
    }

    public static void nameScore(String name) {
        for (int i = 1; i < name.length() - 1; i++) {
            nameScore = nameScore + name.charAt(i) - 64;
        }
        totalNamesScore += nameNumber * nameScore;
        nameScore=0;
    }
}
                                      