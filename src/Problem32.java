import java.util.ArrayList;
import java.util.Arrays;

public class Problem32 {
    private static ArrayList<Integer> noDuplicateProduct = new ArrayList<Integer>();
    private static String a = "";
    private static int result = 0;

    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            for (int j = 1; j < 10000; j++) {
                a = String.valueOf(i) + String.valueOf(j) + String.valueOf(i * j);
                if (a.length() == 9 && permutation(a)) {
                    if (!noDuplicateProduct.contains(i * j)) {
                        noDuplicateProduct.add(i * j);
                        result += i * j;
                    }
                }
            }
        }
        System.out.println(result);
    }

    public static boolean permutation(String a) {
        String stand = "123456789";
        String result = "";
        char[] arr = a.toCharArray();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }
        if (stand.equals(result)) {
            return true;
        }
        return false;
    }
}
