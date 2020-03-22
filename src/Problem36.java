public class Problem36 {

    private static int sum = 0;

    public static void main(String[] args) {
        for (int i = 0; i < 1000000; i++) {
            if (isPalindrom(String.valueOf(i)) & isPalindrom(Integer.toBinaryString(i))) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

    public static boolean isPalindrom(String p) {
        for (int i = 0; i < p.length()/2; i++) {
            if (p.charAt(i) == p.charAt(p.length() - 1 - i)) {
            } else {
                return false;
            }
        }
        return true;
    }
}
