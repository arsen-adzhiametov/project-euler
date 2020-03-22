import java.util.ArrayList;
import java.util.Arrays;

public class Problem49 {
    private static ArrayList<Integer> primes = new ArrayList<Integer>();

    public static void main(String[] args) {
        for (int i = 1001; i < 9999; i += 2) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        arithmeticSequence();
    }

    public static void arithmeticSequence() {
        for (int i = 0; i < primes.size(); i++) {
            if (primes.contains(primes.get(i) + 3330) && primes.contains(primes.get(i) + 6660)) {
                if (permutation(primes.get(i)).equals(permutation(primes.get(i) + 3330)) &&
                        permutation(primes.get(i)).equals(permutation(primes.get(i) + 6660))) {
                    System.out.println(String.valueOf(primes.get(i)) +
                            String.valueOf(primes.get(i) + 3330) +
                            String.valueOf(primes.get(i) + 6660));
                }
            }
        }
    }

    public static String permutation(int a) {
        String result = "";
        char[] arr = String.valueOf(a).toCharArray();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }
        return result;
    }

    public static boolean isPrime(int c) {
        if (c == 2) {
            return true;
        }
        for (int i = 2; i < c; i++) {
            if (c % i == 0) {
                break;
            }
            if (c == i + 1) {
                return true;
            }
        }
        return false;
    }
}
