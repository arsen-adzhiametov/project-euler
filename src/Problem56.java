import java.math.BigInteger;

public class Problem56 {

    private static int maxSumNum=0;

    public static void main(String[] args) {
        for (int a = 0; a < 100; a++) {
            for (int b = 0; b < 100; b++) {
                 if(sumNumbers(BigInteger.valueOf(a).pow(b))>maxSumNum){
                    maxSumNum = sumNumbers(BigInteger.valueOf(a).pow(b));
                 }
            }
        }
        System.out.println(maxSumNum);
    }
    
    public static int sumNumbers(BigInteger b) {
        int count=0;
        for (int i=0; i<b.toString().length(); i++){
           count=count+Integer.valueOf(b.toString().charAt(i)-48);
        }
        return count;
    }
}
