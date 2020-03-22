public class Problem17 {

    private static int sum = 0;

    public static void main(String[] args) {
        for (int i = 1; i < 1000; i++) {
            toStr(i);
        }
        sum += 11; //one thousand
        System.out.println(sum);
    }

    public static void toStr(int a) {
        String s = String.valueOf(a);
        if (s.length() == 1) {
            rec1(a);
        }
        if (s.length() == 2) {
            rec2(a);
        }
        if (s.length() == 3) {
            rec3(a);
        }
    }

    public static void rec1(int a) {
        switch (a) {
            case 1:
                sum += 3;  //one
                break;
            case 2:
                sum += 3;  //two
                break;
            case 3:
                sum += 5;  //three
                break;
            case 4:
                sum += 4;  //four
                break;
            case 5:
                sum += 4;  //five
                break;
            case 6:
                sum += 3;  //six
                break;
            case 7:
                sum += 5;  //seven
                break;
            case 8:
                sum += 5;  //eight
                break;
            case 9:
                sum += 4;  //nine
                break;
        }
    }

    public static void rec2(int a) {
        if (String.valueOf(a).startsWith("1")) {
            switch (a) {
                case 10:
                    sum+=3;      //ten
                    break;
                case 11:
                    sum += 6;    //eleven
                    break;
                case 12:
                    sum += 6;    //twelve
                    break;
                case 13:
                    sum += 8;    //thirteen
                    break;
                case 14:
                    sum += 8;    //fourteen
                    break;
                case 15:
                    sum += 7;    //fifteen
                    break;
                case 16:
                    sum += 7;    //sixteen
                    break;
                case 17:
                    sum += 9;    //seventeen
                    break;
                case 18:
                    sum += 8;    //eighteen
                    break;
                case 19:
                    sum += 8;    //nineteen
                    break;
            }

        } else {
            rec1(Integer.parseInt(String.valueOf(a).substring(1)));
            switch (Integer.parseInt(String.valueOf(a).substring(0, 1))) {
                case 2:
                    sum += 6;
                    break;
                case 3:
                    sum += 6;
                    break;
                case 4:
                    sum += 5;
                    break;
                case 5:
                    sum += 5;
                    break;
                case 6:
                    sum += 5;
                    break;
                case 7:
                    sum += 7;
                    break;
                case 8:
                    sum += 6;
                    break;
                case 9:
                    sum += 6;
                    break;
            }
        }
    }

    public static void rec3(int a) {
        rec1(Integer.parseInt(String.valueOf(a).substring(0, 1)));
        if (String.valueOf(a).contains("00")) {
            sum += 7;
        } else {
            sum += 10; //hundred and
        }

        if (Integer.parseInt(String.valueOf(a).substring(1, 2)) == 0) {
            rec1(Integer.parseInt(String.valueOf(a).substring(2)));
        } else {
            rec2(Integer.valueOf(String.valueOf(a).substring(1)));
        }

    }
}
