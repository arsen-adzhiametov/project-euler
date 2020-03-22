public class Problem37 {

    private static int m = 0;
    private static int n = 0;
    private static int sum = 0;

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

        long time = System.currentTimeMillis();

        for (int i = 10; i < 1000000; i++) {
            if (isPrime(Integer.valueOf(String.valueOf(i).substring(0, 1))) &&
                    isPrime(Integer.valueOf(String.valueOf(i).substring
                            (String.valueOf(i).length() - 1, String.valueOf(i).length())))) {
                m = i;
                n = i;
                while (isPrime(m)) {
                    if (String.valueOf(m).length() > 1) {
                        mDelete(m);
                    } else break;
                }

                while (isPrime(n)) {
                    if (String.valueOf(n).length() > 1) {
                        nDelete(n);
                    } else break;
                }

                if (isPrime(m) && isPrime(n)) {
                    System.out.println(i);
                    sum += i;
                }
            }
        }
        System.out.println("\n" + sum + "\n" + (System.currentTimeMillis() - time) + "ms");
    }

    public static void mDelete(int a) {
        String result = String.valueOf(a).substring(0, String.valueOf(a).length() - 1);
        m = Integer.valueOf(result);
    }

    public static void nDelete(int a) {
        String result = String.valueOf(a).substring(1);
        n = Integer.valueOf(result);
    }
}
