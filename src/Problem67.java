import java.io.*;
import java.util.ArrayList;

public class Problem67 {

    private static ArrayList<int[]> triangle = new ArrayList<int[]>();

    public static void main(String[] args) throws IOException {
        triangleConstructor();
        for (int i = triangle.size() - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                triangle.get(i)[j] += Math.max(triangle.get(i + 1)[j], triangle.get(i + 1)[j + 1]);
            }
        }
        System.out.println(triangle.get(0)[0]);
    }

    private static void triangleConstructor() throws IOException {
        String[] lines = new String[100];
        BufferedReader br = new BufferedReader(new FileReader(new File("triangle.txt")));
        for (int i = 0; i < lines.length; i++) {
            lines[i] = br.readLine();
            String[] numbers = lines[i].split(" ");
            int[] digits = new int[numbers.length];
            for (int j = 0; j < numbers.length; j++) {
                digits[j] = Integer.parseInt(numbers[j]);
            }
            triangle.add(digits);
        }
    }
}
