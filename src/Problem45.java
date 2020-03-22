public class Problem45 {

    public static boolean isPentagonal(long t) {
        double x = ((Math.sqrt(24 * t + 1)) + 1) / 6;
        int temp = (int) x;
        return temp == x;
    }

    public static boolean isHexagonal(long t) {
        double x = ((Math.sqrt(8 * t + 1)) + 1) / 4;
        int temp = (int) x;
        return temp == x;
    }

    public static void main(String[] args) {
        for (long i = 286; i < Integer.MAX_VALUE; i++) {
            if (isPentagonal ((i * (i + 1)) / 2) & isHexagonal((i * (i + 1)) / 2)) {
                System.out.println((i * (i + 1)) / 2);
                System.exit(0);
            }
        }
    }
}
