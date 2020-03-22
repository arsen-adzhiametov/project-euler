public class Problem39 {

    private static int count = 0;
    private static int maxCount = 0;
    private static int maxP = 0;

    public static void main(String[] args) {
        for (int p = 3; p < 1000; p++) {
            calc(p);
        }
        System.out.println(maxP);
    }

    public static void calc(int p) {
        for (int a = 1; a < p; a++) {
            for (int b = 1; b < p; b++) {
                int c = p - a - b;
                double temp = Math.sqrt((a * a) + (b * b));
                if (temp == c) {
                    count++;
                }
                if (maxCount < count) {
                    maxCount = count;
                    maxP = p;
                }
            }
        }
        count = 0;
    }
}
