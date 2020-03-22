public class Problem40 {
    public static void main(String[] args) {
        String str = "";
        int i=0;
        while (str.length()<1000000) {
            i++;
            str += String.valueOf(i);
        }

        int out = (Integer.valueOf(str.charAt(0)) - 48) *
                (Integer.valueOf(str.charAt(9)) - 48) *
                (Integer.valueOf(str.charAt(99)) - 48) *
                (Integer.valueOf(str.charAt(999)) - 48) *
                (Integer.valueOf(str.charAt(9999)) - 48) *
                (Integer.valueOf(str.charAt(99999)) - 48) *
                (Integer.valueOf(str.charAt(999999)) - 48);

        System.out.println(out);
    }
}
