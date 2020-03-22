import java.math.BigInteger;

public class Problem20 {
    public static void main(String[] args) {
        BigInteger  f = new BigInteger("1");
        int sum = 0;
        String str;
        for (int i=1; i<101; i++){
            f=f.multiply(BigInteger.valueOf(i));
        }
        str = f.toString();
        for (int i = 0; i < str.length(); i++) {
            sum += Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        System.out.println(sum);

    }
}