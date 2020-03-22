public class Problem9 {
    public static void main(String[] args) {
        for (double a=0; a<1000; a++){
            for (double b=0; b<1000; b++){
                for (double c=0; c<1000; c++){
                    if (a+b+c ==1000 && Math.pow(a,2)+Math.pow(b,2)==Math.pow(c,2)){
                        long multy=(long)(a*b*c);
                        System.out.println("a = "+a+" b = "+b+" c = "+c+"       M = "+multy);
                    }
                }
            }
        }
    }
}
