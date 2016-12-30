import java.util.Scanner;

/**
 * Created by thinkpad on 2016/12/29.
 */
public class PAT_1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] aresult = new int[3];
        int[] bresult = new int[3];
        int[] aaction = new int[3];
        int[] baction = new int[3];


        for (int i = 0; i < num; i++) {
            String str1 = sc.next();
            String str2 = sc.next();
            if (compare(str1, str2) == 1) {
//                a win
                aresult[0]++;
                bresult[2]++;
                if (str1.equals("J")) {
                    aaction[0]++;
                } else if (str1.equals("C")) {
                    aaction[1]++;
                } else {
                    aaction[2]++;
                }
            } else if (compare(str1, str2) == 0) {
//                draw
                aresult[1]++;
                bresult[1]++;
            } else {
//                B win
                aresult[2]++;
                bresult[0]++;
                if (str2.equals("J")) {
                    baction[0]++;
                } else if (str2.equals("C")) {
                    baction[1]++;
                } else {
                    baction[2]++;
                }
            }
//            System.out.print(str1);
//            System.out.print(" ");
//            System.out.println(str2);
//            System.out.println(str.split(" ")[0]);
//            System.out.println(str.split(" ")[1]);
        }
        System.out.println(aresult[0] + " " + aresult[1] + " " + aresult[2]);
        System.out.println(bresult[0] + " " + bresult[1] + " " + bresult[2]);
        System.out.println(findAction(aaction) + " " + findAction(baction));
    }

    public static int compare(String x, String y) {
        if (x.equals("C")) {
            if (y.equals("C")) {
                return 0;
            } else if (y.equals("B")) {
                return -1;
            } else {
//                J
                return 1;
            }
        } else if (x.equals("J")) {
            if (y.equals("C")) {
                return -1;
            } else if (y.equals("B")) {
                return 1;
            } else {
//                J
                return 0;
            }

        } else {
//            B
            if (y.equals("C")) {
                return 1;
            } else if (y.equals("B")) {
                return 0;
            } else {
//                J
                return -1;
            }
        }
    }

    public static String findAction(int[] action) {
        int footnum = -1;
        String foot = null;
        int t = 0;
        for (int i = 0; i < action.length; i++) {
            if (t <= action[i]) {
                t = action[i];
                footnum = i;
            }
        }
        if (footnum == 0) {
            foot = "J";
        } else if (footnum == 1) {
            foot = "C";
        } else {
            foot = "B";
        }
        return foot;
    }

}
