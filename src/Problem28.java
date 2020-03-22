public class Problem28 {
    public static void main(String[] args) {
        long time=System.currentTimeMillis();
        int n = 2;
        int count = 0;
        int sum = 1;
        for (int num = 1; num < 1001; num = num + 2) {
            for (int i = num * num; i < 1001 * 1001; i = i + n) {
                sum = sum + i + n;
                count++;
                if (count == 4) {
                    break;
                }
            }
            count = 0;
            n = n + 2;
        }
        System.out.println(sum);
        System.out.println(System.currentTimeMillis()-time+" ms");
    }
}
