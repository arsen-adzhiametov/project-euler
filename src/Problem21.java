public class Problem21 {
    public static int summ (int n){
        int sum=0;
        for (int i=1; i<n; i++){
            if (n%i==0){
                sum=sum+i;
            }
        }
       return sum;
    }
    public static void main(String[] args) {
        int summ = 0;
        for (int i = 0; i < 10000; i++) {
          int temp = summ(i);
          if (i != temp && i==summ(temp)){
              summ += i + temp;
          }
        }
        System.out.println(summ/2);
    }
}
