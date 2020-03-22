public class Problem7 {
    public static void main(String[] args) {
        int p = 1;
        for (int i = 2; i < 110000; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                }
                if (i == j + 1) {
                    p++;
                    System.out.println(p + " " + i);
                }
            }
        }
    }
}
