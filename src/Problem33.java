public class Problem33 {
    public static void main(String[] args) {
        for (int i = 10; i < 100; i++) {
            for (int j = i + 1; j < 100; j++) {
                if (i%10!=0 & (double) i / j == fraction(i, j)) {
                    System.out.println(i + "/" + j);
                }
            }
        }
    }

    public static double fraction(int a, int b) {
        if (String.valueOf(a).charAt(0) == String.valueOf(b).charAt(0)) {
            return (double) Integer.parseInt(String.valueOf(a).substring(1)) / Integer.parseInt(String.valueOf(b).substring(1));
        }
        if (String.valueOf(a).charAt(0) == String.valueOf(b).charAt(1)) {
            return (double) Integer.parseInt(String.valueOf(a).substring(1)) / Integer.parseInt(String.valueOf(b).substring(0, 1));
        }
        if (String.valueOf(a).charAt(1) == String.valueOf(b).charAt(0)) {
            return (double) Integer.parseInt(String.valueOf(a).substring(0, 1)) / Integer.parseInt(String.valueOf(b).substring(1));
        }
        if (String.valueOf(a).charAt(1) == String.valueOf(b).charAt(1)) {
            return (double) Integer.parseInt(String.valueOf(a).substring(0, 1)) / Integer.parseInt(String.valueOf(b).substring(0, 1));
        }
        return a / b;
    }
}
