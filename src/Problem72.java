public class Problem72 {

    private static long count = 0;

    public static void main(String[] args) {
        long time = System.currentTimeMillis();

        for (int d = 2; d <= 1000000; d++) {

            for (int n = 1; n < d; n++) {

                if (NOD(n, d)) count++;
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
