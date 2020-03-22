public class Problem3 {
    public static void main(String[] args) {
        long a = 600851475143L;
        for (int i= (int)Math.sqrt(a); i>0; i-- ){
            if  (a%i==0 && isPrime(i)){
                System.out.println(i);
                System.exit(0);
            }
        }
    }
    public static boolean isPrime(int c) {
        if (c == 2) {
            return true;
        }
        for (int i = 2; i < c; i++) {
            if (c % i == 0) {
                break;
            }
            if (c == i + 1) {
                return true;
            }
        }
        return false;
    }
}