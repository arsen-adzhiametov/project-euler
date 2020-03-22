import java.math.BigDecimal;
import java.math.MathContext;

public class Problem100 {
    public static void main(String[] args) {
        MathContext mc = new MathContext(100);
        BigDecimal blueDisks=new BigDecimal("50");
        BigDecimal allDisks= new BigDecimal("1000000000000");
        BigDecimal one = new BigDecimal("1");
        BigDecimal two = new BigDecimal("2");

        while (((blueDisks.multiply(blueDisks.subtract(one)))
                .divide(allDisks.multiply(allDisks.subtract(one)), mc)).compareTo(new BigDecimal(0.5)) !=0) {

            allDisks = allDisks.add(one);
            blueDisks = (one.add(sqrt(one.add(allDisks.multiply(allDisks.subtract(one)).multiply(two)), mc))).divide(two);
            System.out.println(blueDisks);
            blueDisks = new BigDecimal(blueDisks.toBigInteger());
        }
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
