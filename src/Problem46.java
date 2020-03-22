public class Problem46 {

    public static void main(String[] args) {
        for (int i = 2; i < 10000; i++) {
            if (i % 2 != 0 && isComposite(i)) {
                test(i);
            }
        }
    }

    public static void test(int t) {
        for (int i = t - 2; i > 1; i--) {
            if (isComposite(i) == false) {
                int temp = (int) Math.sqrt((t - i) / 2);
                if (temp == Math.sqrt((t - i) / 2)) {
                    break;
                } else if (i == 3) {
                    System.out.println(t);
                    System.exit(0);
                }
            }
        }
    }

    public static boolean isComposite(int c) {
        if (c == 2) {
            return false;
        }
        for (int i = 2; i < c; i++) {
            if (c % i == 0) {
                break;
            }
            if (c == i + 1) {
                return false;
            }
        }
        return true;
    }
}
