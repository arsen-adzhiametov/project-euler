public class Problem69 {
    private static double phi = 0;
    private static double max = 0;
    private static int maxN = 0;

    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        for (int n = 2; n <= 100000; n++) {
            phi = 0;
            for (int m = n - 1; m > 0; m--) {
                NOD(n, m, 1);

            }
            //System.out.println(n + "-------"+maxN);
            if (max<n / phi){
                max=n / phi;
                maxN = n;
            }
        }
        System.out.println("max n is "+maxN + "\n" + (System.currentTimeMillis() - time) + "ms");
    }

    public static void NOD(int n, int m, int a) {
        a = n % m;
        n = m;
        m = a;
        if (a > 0) {
            NOD(n, m, a);
        } else if (n == 1) phi++;
    }
}
