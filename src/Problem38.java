import java.util.Arrays;

public class Problem38 {
    public static boolean isPandigital(String str) {
        String stand = "123456789";
        String result = "";
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }
        if (stand.equals(result.trim())) {
            return true;
        }
        return false;
    }

    public static void multiplyAndCheck(int a) {
        String number = "";
        for (int i = 1; i < 10; i++) {
            number += String.valueOf(a * i);
            if (number.length()==9 && isPandigital(number)){
                System.out.println(number);
                return;
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 9; i < 10000; i++) {
            multiplyAndCheck(i);
        }
    }
}
