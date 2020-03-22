public class Problem4 {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        int maxPalindrom = 0;
        for (int i = 999; i >= 100; i--) {
            for (int j = 999; j >= 100; j--) {
                int a = i * j;
                String str = Integer.toString(a);
                if (str.length() == 6) {
                    if (str.charAt(0) == str.charAt(5) & str.charAt(1) == str.charAt(4) & str.charAt(2) == str.charAt(3)) {
                        if (maxPalindrom < a) maxPalindrom = a;
                    }
                }
            }
        }
        System.out.println(maxPalindrom + "\n" + (System.currentTimeMillis() - time) + " ms");
    }
}