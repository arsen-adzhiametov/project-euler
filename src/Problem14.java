public class Problem14 {

    public static long i=0;

    public static void main(String[] args) {

        for (i = 999999; i > 1; i--) {
            test(i);
        }
        System.out.println(temp);
    }

    private static long n = 1;
    private static long max = 0;
    private static long temp = 0;

    private static void test(long q) {
        while (q != 1) {
            if (q % 2 == 0) {
                q = even(q);
            } else {
                q = odd(q);
            }
        }
        if (n > max) {
            max = n;
            temp = i;
        }
        n = 1;
    }

    private static long even(long k) {
        long m = k / 2;
        n = n + 1;
        return m;
    }

    private static long odd(long t) {
        long r = 3 * t + 1;
        n = n + 1;
        return r;
    }
}