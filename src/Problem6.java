public class Problem6 {
    public static void main(String[] args) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 1; i < 101; i++) {
            sum2 += i * i;
            sum1 += i;
        }
        sum1 = sum1 * sum1;
        System.out.println(sum1 - sum2);
    }
}
