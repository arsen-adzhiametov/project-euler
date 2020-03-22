public class Problem34 {

    private static int finalSum = 0;

    public static void main(String[] args) {
        for (int i = 3; i < 999999; i++) {
            test(i);
        }
        System.out.println(finalSum);
    }

    public static void test(int a) {
        int[] arr = new int[10];
        String digits = String.valueOf(a);
        for (int i = 0; i < digits.length(); i++) {
            arr[i] = Integer.parseInt(String.valueOf(digits.charAt(i)));
        }
        int testSum = 0;
        for (int i = 0; i < digits.length() ; i++) {
            testSum = testSum + factorial(arr[i]) ;
        }
        if (testSum == a) {
            finalSum += a;
        }
    }
    public static int factorial(int n)
    {
        return ( n==0 ? 1 : n*factorial(n-1) );
    }
}