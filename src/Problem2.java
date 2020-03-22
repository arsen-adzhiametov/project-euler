public class Problem2 {
    public static void main(String args[]) {
        int n = 4000000;
        int a = 0, b = 1;
        int s = 0;
        while (b < n) {
            a = a + b;
            b = a - b;
            if (a % 2 == 0) {
                s += a;
            }
        }
        System.out.println(s);
    }
}

