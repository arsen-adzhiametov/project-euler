import java.math.BigInteger;

public class Problem15 {
    public static void main(String[] args) {

        BigInteger a = new BigInteger("20");
        BigInteger b = new BigInteger("20");
        a=a.pow(20);
        a=a.add(b);

        System.out.println(a);
    }
}
