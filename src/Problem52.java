import java.util.Arrays;

public class Problem52 {
    public static void main(String[] args) {
        for (int i=1; i<Integer.MAX_VALUE; i++){
            if (trans(i)==trans(2*i) & trans(i)==trans(3*i) & trans(i)==trans(4*i)
                    & trans(i)==trans(5*i) & trans(i)==trans(6*i)){
                System.out.println(i);
                System.exit(0);
            }
        }
    }

    public static int trans(int a) {
        String number = "";
        String[] numStr = String.valueOf(a).split("");
        Arrays.sort(numStr);
        for (String num : numStr) {
            number += num;
        }
        return Integer.parseInt(number);
    }
}
