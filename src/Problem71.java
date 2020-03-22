public class Problem71 {

    private static int num = 2;
    private static int den = 5;
    private static final int CONST = 1;

    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        for (int d = 2; d <= 1000000; d++) {
            for (int n = 3 * d / 7 - CONST; n < 3 * d / 7 + CONST; n++) {
                if ((double) n / d < (double) 3 / 7) {
                    if ((double) num / den < (double) n / d) {
                        num = n;
                        den = d;

                    }
                }
            }

        }System.out.println(num + " / " + den + "\n"+(System.currentTimeMillis()-time)+" ms");
    }
}
