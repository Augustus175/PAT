import java.util.Scanner;

/**
 * Created by thinkpad on 2016/12/29.
 */
public class PAT_1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();


        for (int i = 0; i < num ; i++) {
            String str1 = sc.next();
            String str2 = sc.next();
            System.out.println("-------------------------------------------------------------");
            System.out.println(compare(str1,str2));
//            System.out.print(str1);
//            System.out.print(" ");
//            System.out.println(str2);
//            System.out.println(str.split(" ")[0]);
//            System.out.println(str.split(" ")[1]);
        }
    }

    public static int compare(String x, String y) {
        if (x.equals("C") ) {
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

}
