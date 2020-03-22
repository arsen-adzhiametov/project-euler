public class Problem35 {

    private static int count = 0;
    private static int num = 0;
    private static int out = 0;

    public static void main(String[] args) {
        for (int i = 0; i < 1000000; i++) {
            num = i;
            count = 0;
            while (isPrime(num)) {
                if (String.valueOf(num).length() - 1 > count) {
                    shift(num);
                } else {
                    out++;
                    break;
                }
            }
        }
        System.out.println(out);
    }

    public static int shift(int a) {
        String b = String.valueOf(a);
        String c = b.charAt(b.length() - 1) + b.substring(0, b.length() - 1);
        num = Integer.valueOf(c);
        count++;
        return num;
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
