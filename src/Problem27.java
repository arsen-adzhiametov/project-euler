public class Problem27 {

    public static void main(String[] args) {
        for (int a = -999; a < 1000; a++) {
            for (int b = -999; b < 1000; b++) {
                for (int n = 0; n < 1000; n++) {
                    if (n * n + a * n + b == isPrime(n * n + a * n + b)) {
                        count++;
                        if (maxCount < count) {
                            maxCount = count;
                            product = a*b;
                        }
                    } else break;
                }
                count = 0;
            }
        }
        System.out.println(product);
    }

    public static int isPrime(int p) {
        int x;
        for (x = 2; x < p; x++) {
            if (p % x == 0) {
                break;
            }
            if (p == x + 1) {
                continue;
            }
        }
        return x;
    }

    private static int count = 0;
    private static int maxCount = 0;
    private static int product=0;
}
