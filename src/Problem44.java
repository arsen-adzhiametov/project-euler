public class Problem44 {

    private static int[] p = new int[3000];

    public static void pentagonalNumbersGen() {
        for (int n = 0; n < p.length; n++) {
            p[n] = ((n + 1) * (3 * (n + 1) - 1)) / 2;
        }
    }


    public static void main(String[] args) {
        pentagonalNumbersGen();
        for (int i = 1; i < 3000; i++) {
          testSumAndDiff(i);
        }
    }

    public static void testSumAndDiff(int a) {
        for (int j = 0; j < p.length - a; j++) {
            for (int i = 0; i < p.length; i++) {
                if (p[j] + p[j + a] == p[i]) {
                    for (int m = 0; m < p.length; m++) {
                        if (p[j + a] - p[j] == p[m]) {
                            System.out.println(p[j+a]-p[j]);
                            System.exit(0);
                        }
                    }
                }
            }
        }
    }
}
