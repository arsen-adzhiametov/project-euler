import java.math.BigInteger;

public class Problem25 {

    public static void main(String[] args) {
        long time=System.currentTimeMillis();
        int l=0;
        BigInteger a = new BigInteger("0");
        BigInteger b = new BigInteger("1");
        for (int i = 1; i <= 9999; i++) {
            a = a.add(b);
            b = a.subtract(b);
            l=a.toString().length();
            if (l==1000){
                System.out.println(i);
                break;
            }
        }
        System.out.println(System.currentTimeMillis()-time+" ms");
    }
}
