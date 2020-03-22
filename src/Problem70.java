import java.util.Arrays;

public class Problem70 {

    private static double phi = 0;
    private static double min = 1000000;
    private static int minN;

    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        for (int n = 10000000; n >=2; n--) {

            // Сложнейшая функйия, нужен другой алгоритм
            for (int m = n - 1; m > 0; m--) {
                if (NOD(n, m)) phi++;
            }

                if (min > n / phi) {
                    min = n / phi;
                    minN = n;
                }
                System.out.println("n = "+n + "; minN = " + minN + "       double " + min);

        }
        System.out.println(" minN = " + minN + "  " + (System.currentTimeMillis() - time) + "ms");
    }

    public static boolean isPermutation(double p, int n) {
        char[] phiStr = String.valueOf((int) p).toCharArray();
        char[] nStr = String.valueOf(n).toCharArray();
        Arrays.sort(phiStr);
        Arrays.sort(nStr);
        String a = String.copyValueOf(phiStr);
        String b = String.copyValueOf(nStr);
        if (a.equals(b)) return true;
        return false;
    }

    public static boolean NOD(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        if (a == 1) return true;
        return false;
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
