import java.math.BigDecimal;
import java.math.MathContext;

public class Problem80 {

    private static int sum = 0;

    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        MathContext mc = new MathContext(102);
        for (int i = 2; i < 100; i++) {
            if (i != 4 && i != 9 && i != 16 && i != 25 && i != 36 && i != 49 && i != 64 && i != 81) {
                BigDecimal decimal = new BigDecimal(String.valueOf(i));
                decimal = sqrt(decimal, mc);
                String dec = decimal.toString().replace(".", "").substring(0, 100);
                for (int j = 0; j < dec.length(); j++) {
                    sum += Integer.parseInt(String.valueOf(dec.charAt(j)));
                }
            }
        }
        System.out.println(sum + "\n" + (System.currentTimeMillis() - time));
    }


    private static BigDecimal sqrt(BigDecimal x, MathContext mc) {
        BigDecimal TWO = BigDecimal.valueOf(2L);
        BigDecimal g = x.divide(TWO, mc);
        boolean done = false;
        final int maxIterations = mc.getPrecision() + 1;
        for (int i = 0; !done && i < maxIterations; i++) {
            BigDecimal r = x.divide(g, mc);
            r = r.add(g);
            r = r.divide(TWO, mc);
            done = r.equals(g);
            g = r;
        }
        return g;
    }
}
