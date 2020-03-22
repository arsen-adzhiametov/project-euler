public class Problem1 {
    public static void main(String[] args) {
        int[] arr = new int[1000];
        int s=0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            if ((arr[i])%3==0 || (arr[i]%5)==0) {
                 s+=arr[i];
            }
        }
        System.out.println(s);
    }
}