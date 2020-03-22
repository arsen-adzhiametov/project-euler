import java.math.BigInteger;

public class Problem63 {
    public static void main(String[] args) {
        int count = 0;
        for(int i=1; i<10; i++){
            for (int j=1; j<100; j++){
                BigInteger b = new BigInteger(String.valueOf(i));
                if (b.pow(j).toString().length()==j){
                    count ++;
                   System.out.println(b.pow(j));
                }
            }
        }
        System.out.println(count);
    }
}
