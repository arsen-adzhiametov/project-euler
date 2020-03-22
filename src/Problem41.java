import java.math.BigInteger;
import java.util.Arrays;

public class Problem41 {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        int max = 0;
        for (int i = 7654321; i > 0  ; i--) {
            BigInteger b = new BigInteger(String.valueOf(i));
            if (isPandigital(i) && b.isProbablePrime(1)) {
                if (i > max) {
                    max = i;
                }
            }
        }
        System.out.println(max + "\n" + (System.currentTimeMillis() - time) + "ms");
    }

    public static boolean isPandigital(int a) {
        String stand = "123456789";
        String result = "";
        char[] arr = String.valueOf(a).toCharArray();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }
        if (stand.substring(0, arr.length).contains(result.trim())) {
            return true;
        }
        return false;
    }
}
