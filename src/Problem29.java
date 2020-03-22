import java.util.ArrayList;

public class Problem29 {
    public static void main(String[] args) {
        ArrayList<Double> doubles = new ArrayList<Double>();
        double d;
        for (double a = 2; a <= 100; a++) {
            for (double b = 2; b <= 100; b++) {
                d = Math.pow(a, b);
                if (doubles.contains(d)){
                    
                } else doubles.add(d);
            }
        }
        System.out.println(doubles.size());
    }
}
