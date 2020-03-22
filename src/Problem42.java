import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Problem42 {

    private static int sum = 0;
    private static int tempSum = 0;
    private static int[] triangleNumArr = new int[30];

    public static void triangleNumbers() {
        for (int n = 1; n < triangleNumArr.length; n++) {
            triangleNumArr[n] = (n * (n + 1) / 2);
        }
    }

    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
        Scanner in = new Scanner(new File("words.txt"));
        String str = in.next();
        in.close();
        String[] words = str.split(",");
        triangleNumbers();
        for (int i = 0; i < words.length; i++) {
            testString(words[i]);
        }
        System.out.println(sum);
    }

    public static void testString(String word) {
        tempSum = 0;
        for (int i = 1; i < word.length() - 1; i++) {
            tempSum += word.charAt(i) - 64;
        }
        for (int i = 0; i < triangleNumArr.length; i++) {
            if (triangleNumArr[i] == tempSum) {
                sum++;
            }
        }
    }
}
