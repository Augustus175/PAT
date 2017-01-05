import java.util.Scanner;

/**
 * Created by Gavin.Stevenson on 2017/1/4.
 */
public class PAT_1027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = sc.next();
        int n = 0;
        int i = 1;
        int count = 6;
        int sum = 6;
        if (num >= 7) {
            while (sum < num - 1) {
                count = count + 4;
                sum = sum + count;
                n++;
            }
            count = count - 4;
            System.out.println(n);
            int m = n - 1;
            int counttmp1 = count;
            System.out.println(count);
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < (count/2 - counttmp1 / 2 ) / 2; k++) {
                    System.out.print(" ");
                }
                for (int k = counttmp1 / 2; k > 0; k--) {
                    System.out.print(str);
                }
                System.out.println();
                counttmp1 = counttmp1 - 4;
            }
//            -------------------------------------------------------------------------------------------------------------------------------------
            for (int j = 0; j < (count-1 )/ 2 - 3; j++) {
                System.out.print(" ");
            }
            System.out.println("***");
//            ---------------------------------------------------------------------------------------------------------------------------
            for (int j = 0; j < (count-1)/2-2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");

            for (int j = 0; j < (count-1)/2-3; j++) {
                System.out.print(" ");
            }
            System.out.println("***");
//            for (int j = 0; j < count / 2 - 2; j++) {
//                System.out.print(" ");
//            }
            int counttmp2 = count;
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < j ; k++) {
                    System.out.print(" ");
                }
                for (int k = 0; k <=counttmp2 / 2 ; k++) {
                    System.out.print(str);
                }
                System.out.println();
                counttmp2 = counttmp2 - 4;
            }

        } else {
            System.out.println(str);
        }
//        System.out.println(num + "  " + str);

    }
}
