public class Problem10 {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        long sum = 0;
        for (int i = 2; i <2000000; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                }
                if (i == j + 1) {
                    sum+=i;
                }
            }
        }
        System.out.println(sum+2);
        System.out.println(System.currentTimeMillis()-time);
    }
}