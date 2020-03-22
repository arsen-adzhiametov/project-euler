import java.math.BigInteger;

public class Problem97 {
    public static void main(String[] args) {
        BigInteger n = new BigInteger("2");
        BigInteger b = n.pow(7830457);
        b=(b.multiply(new BigInteger("28433"))).add(BigInteger.ONE);
        System.out.println(b.toString().substring(2357197));
    }
}

//Хитрый египетский код
//static int pow=7830457;
//static int mult=28433;
//static long mod=Long.parseLong("10000000000");
//
//    public static void main(String[] args) {
//        long x=1;
//        x=pow(x);
//        x=mulAndInc(x);
//        System.out.println(x);
//    }
//
//    private static long mulAndInc(long x) {
//        x*=mult;
//        x%=mod;
//        x++;
//        return x;
//    }
//
//    private static long pow(long x) {
//        for(int i=0;i<pow;i++)
//        {
//            x*=2;
//            x%=mod;
//        }
//        return x;
//    }
