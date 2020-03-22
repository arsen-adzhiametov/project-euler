public class Problem26 {
    public static void main(String[] args) {
        double d = 0;
        for (double i = 2; i < 1000; i++) {
            d = 1 / i;
            toStr(d);
        }
    }

    public static void toStr(double a) {
        String d = String.valueOf(a).substring(2);
        System.out.println(d);
    }
}
