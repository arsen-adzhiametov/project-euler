import java.math.BigInteger;

public class Problem55 {
    private static int n;
    private static int count = 0;

    public static void main(String[] args) {
        for (int i = 10; i < 10000; i++) {
            n = 0;
            testLychrel(new BigInteger(String.valueOf(i)));
        }
        System.out.println(count);
    }

    public static void testLychrel(BigInteger d) {
        if (n == 50) {
            count++;
            return;
        }
        if (isPalindrom(reverseAndAdd(d))) {
            return;
        } else {
            testLychrel(reverseAndAdd(d));
        }
    }

    public static boolean isPalindrom(BigInteger b) {
        String p = b.toString();
        for (int i = 0; i < p.length() / 2; i++) {
            if (p.charAt(i) == p.charAt(p.length() - 1 - i)) {
            } else {
                return false;
            }
        }
        return true;
    }

    public static BigInteger reverseAndAdd(BigInteger a) {
        n++;
        char[] b = a.toString().toCharArray();
        String c = "";
        for (int i = b.length - 1; i >= 0; i--) {
            c += b[i];
        }
        BigInteger result = a.add(new BigInteger(c));
        return result;
    }
}
