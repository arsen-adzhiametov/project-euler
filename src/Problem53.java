import java.math.BigInteger;

public class Problem53 {

    private static BigInteger comb;
    private static BigInteger million = new BigInteger("1000000");
    private static int count;

    public static void main(String[] args) {
        for (int n = 1; n <= 100; n++) {
            for (int r = 1; r <= n; r++) {
                comb = factorial(n).divide((factorial(r).multiply(factorial(n - r))));
                if (comb.compareTo(million) > 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static BigInteger factorial(int n) {
        if (n == 0) return BigInteger.ONE;
        return BigInteger.valueOf(n).multiply(factorial(n - 1));
    }
}
