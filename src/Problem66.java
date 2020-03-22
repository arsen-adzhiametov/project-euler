import java.math.BigInteger;

// Не могу решить, работатет только для маленьких значений. Нужно изучать теорию уравнения Пелля

public class Problem66 {

    private static int minD = 0;
    private static BigInteger maxX = new BigInteger("0");

    public static void main(String[] args) {
        for (int d = 1; d <= 13; d++) {
            if (d % Math.sqrt(d) == 0)
                continue;
            diophantineEquation(d);
        }
        System.out.println(minD);
    }


    public static void diophantineEquation(int d) {
        BigInteger x = new BigInteger("0");
        BigInteger y = new BigInteger("0");
        BigInteger D = new BigInteger(String.valueOf(d));
        while (!x.multiply(x).subtract(D.multiply(y).multiply(y)).equals(BigInteger.ONE)) {
            y = y.add(BigInteger.ONE);
            x = sqrt(D.multiply(y).multiply(y).add(BigInteger.ONE));
        }
        System.out.println(x + " " + d + " " + y);
        if (maxX.compareTo(x)<1) {
            maxX = x;
            minD = d;
        }
    }
    public static BigInteger sqrt(BigInteger n)
    {
        BigInteger a = BigInteger.ONE;
        BigInteger b = new BigInteger(n.shiftRight(5).add(new BigInteger("8")).toString());
        while(b.compareTo(a) >= 0) {
            BigInteger mid = new BigInteger(a.add(b).shiftRight(1).toString());
            if(mid.multiply(mid).compareTo(n) > 0) b = mid.subtract(BigInteger.ONE);
            else a = mid.add(BigInteger.ONE);
        }
        return a.subtract(BigInteger.ONE);
    }
}
