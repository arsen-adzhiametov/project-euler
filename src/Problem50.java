public class Problem50 {

    public static int sum = 0;
    public static int count = 0;

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

    public static void main(String[] args) {
        for (int i = 0; i <9000; i++) {
            if (isPrime(i)) {
                sum += i;
                count++;
                if (isPrime(sum) && sum<1000000) {
                    System.out.println(sum + " " + count);
                }
            }
        }
    }
}
