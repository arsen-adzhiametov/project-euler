public class Problem12 {
    public static void main(String[] args) {
        long sum = 0;
        int n = 0;
        int i;
        outer: for (i = 12000; i <=Integer.MAX_VALUE; i++) {
            for (int j = 1; j <= i; j++) {
                sum = sum + j;
            }
            for (long k = 1; k <= sum; k++) {
                if (sum % k == 0) {
                    n++;
                }
                if (n == 501){
                    System.out.println("sum = " + sum + "\ni = " + i);
                    break outer;
                }
            }
            n = 0;
            sum = 0;
        }
    }
}