import java.util.ArrayList;

public class Problem23 {
    private static int result = 0;
    private static ArrayList<Integer> abundant = new ArrayList<Integer>();

    public static void createAbundantArray() {
        int sumOfDivisors = 0;
        for (int i = 12; i < 28125; i++) {
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sumOfDivisors += j;
                }
            }
            if (sumOfDivisors > i) {
                abundant.add(i);
            }
            sumOfDivisors = 0;
        }
    }

    public static void findAndExtract(int a) {
        for (int i = 0; i < abundant.size() - 1; i++) {
            for (int j = 0; j < abundant.size(); j++) {
                if ((a - abundant.get(i)) == abundant.get(j)) {
                    result -= a;
                    return;
                }
            }
        }
    }

    public static void main(String[] args) {
        createAbundantArray();
        System.out.println(abundant);
        for (int i = 1; i < 28124; i++) {
            result += i;
            findAndExtract(i);
        }
        System.out.println(result);
    }
}
