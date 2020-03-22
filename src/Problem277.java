import java.math.BigInteger;
import java.util.ArrayList;

public class Problem277 {

    static BigInteger zero = new BigInteger("0");
    static BigInteger one = new BigInteger("1");
    static BigInteger two = new BigInteger("2");
    static BigInteger three = new BigInteger("3");
    static BigInteger four = new BigInteger("4");

    public static void main(String[] args) {
        BigInteger a = new BigInteger("1000000000000000");
        BigInteger b = new BigInteger("1000001000000000");
        do {
            test(a);
            a = a.add(one);
        } while (a.longValue() < b.longValue());

    }

    public static void test(BigInteger a) {
        String answer = a.toString();
        ArrayList<Character> chars = new ArrayList<Character>();
        do {
            if (a.mod(three).equals(zero)) {
                a = a.divide(three);
                chars.add('D');
            } else if (a.mod(three).equals(one)) {
                a = (((a.multiply(four)).add(two))).divide(three);
                chars.add('U');
            } else if (a.mod(three).equals(two)) {
                a = (((a.multiply(two)).subtract(one))).divide(three);
                chars.add('d');
            }
        } while (a.intValue() != 1);
        if (chars.subList(0, 30).equals(standart())) {
            System.out.println(chars + " " + answer);
        }
        chars.clear();
    }

    public static ArrayList<Character> standart() {
        ArrayList<Character> chars2 = new ArrayList<Character>();
        String str = "UDDDUdddDDUDDddDdDddDDUDDdUUDd";
        for (char ch : str.toCharArray()) {
            chars2.add(ch);
        }
        return chars2;
    }
}
