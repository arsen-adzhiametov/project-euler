public class Problem30 {

    private static int finalSum = 0;

    public static void main(String[] args) {
        for (int i = 2; i < 1000000; i++) {
            test(i);
        }
        System.out.println(finalSum);
    }

    public static void test(int a) {
        double[] arr = new double[10];
        String digits = String.valueOf(a);
        for (int i = 0; i < digits.length(); i++) {
            arr[i] = (double) Integer.parseInt(String.valueOf(digits.charAt(i)));
        }
        double testSum = 0;
        for (int i = 0; i < arr.length; i++) {
            testSum = testSum + Math.pow(arr[i], 5);
        }
        if (testSum == a) {
            finalSum += a;
        }
    }
}
