public class Problem73 {

    private static int count = 0;
    private static final int CONST = 1;

    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        for (int d = 2; d <= 12000; d++) {
            for (int n = 1 * d / 3 - CONST; n < 1 * d / 2 + CONST; n++) {
                if ((double) n / d < (double) 1 / 2 && (double) n / d > (double) 1 / 3) {
                    if (NOD(n, d)) count++;
                }
            }
        }
        System.out.println(count + "\n" + (System.currentTimeMillis() - time) + " ms");
    }

    private static boolean NOD(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        if (a == 1) return true;
        return false;
    }
}
