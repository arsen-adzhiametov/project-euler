import java.util.Arrays;

public class Problem24 {
    public static void main(String[] args) {
        int count = 0;
        for (long i = 123456789; i <= 987654321; i++) {
            if (permutation("0" + String.valueOf(i))) {
                count++;
            }
        }
        for (long i = 1023456789; i <= 9876543210L; i++) {
            if (permutation(String.valueOf(i))) {
                count++;
                if (count == 1000000) {
                    System.out.println(i);
                    System.exit(0);
                }
            }
        }
    }

    public static boolean permutation(String a) {
        String stand = "0123456789";
        String result = "";
        char[] arr = a.toCharArray();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }
        if (stand.contains(result.trim())) {
            return true;
        }
        return false;
    }
}
