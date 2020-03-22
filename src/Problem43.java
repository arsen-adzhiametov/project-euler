import java.util.Arrays;

public class Problem43 {
    public static void main(String[] args) {
        long sum = 0;
        for (long i = 1023456789; i <= 9876543210L; i++) {
            if (permutation(String.valueOf(i))&& divisibility(String.valueOf(i))) {
                sum+=i;
            }
        }
        System.out.println(sum);
    }

    public static boolean divisibility(String digit) {
        if ((Integer.parseInt(digit.substring(1, 4)) % 2 == 0) &&
                (Integer.parseInt(digit.substring(2, 5)) % 3 == 0) &&
                (Integer.parseInt(digit.substring(3, 6)) % 5 == 0) &&
                (Integer.parseInt(digit.substring(4, 7)) % 7 == 0) &&
                (Integer.parseInt(digit.substring(5, 8)) % 11 == 0) &&
                (Integer.parseInt(digit.substring(6, 9)) % 13 == 0) &&
                (Integer.parseInt(digit.substring(7, 10)) % 17 == 0)) {
            return true;
        }
        return false;
    }

    public static boolean permutation(String a) {
        String stand = "0123456789";
        String result = "";
        char[] arr = a.toCharArray();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }
        if (stand.contains(result.trim())) {
            return true;
        }
        return false;
    }
}
