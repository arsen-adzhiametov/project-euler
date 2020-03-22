import java.math.BigInteger;

public class Problem16 {
    public static void main(String[] args) {
        BigInteger a = new BigInteger("2");
        a=a.pow(1000);
        String str=a.toString();
        int sum=0;
        System.out.println(a);
        for (int i = 0; i < str.length(); i++) {
            sum += str.charAt(i)-'0';
        }
        System.out.println(sum);
    }
}
