public class Problem243 {

    static final double d1 = 15499;
    static final double d2 = 94744;

    public static void main(String[] args) {
        for (long d = 2; d < Long.MAX_VALUE; d++) {
            double resilience = ((double) resilientFraction(d) / (d - 1));
            if (resilience < d1 / d2) {
                System.out.println(d);
                System.exit(0);
            }
        }
    }

    public static int resilientFraction(long d) {
        int resilientFractionCount = 1;
        for (long i = 2; i < d; i++) {
            if (test(i, d)) {
                resilientFractionCount++;
            }
        }
        return resilientFractionCount;
    }

    public static boolean test(long a, long b) {
        if (b / a == 0) {
            return false;
        }
        if (isPrime(b)){
            return true;
        }
        for (long i = 2; i < b; i++) {
            if (b % i == 0 && a % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrime(long c) {
        if (c == 2) {
            return true;
        }
        for (long i = 2; i < c; i++) {
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
