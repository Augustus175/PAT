/**
 * Created by Gavin.Stevenson on 2016/11/29.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class PAT_1012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] numstr = line.split("\\s+");
        int[] num = new int[numstr.length];
        int even = 0;
        int numA2 = 0;
        int A2count = 0;
        int A3count = 0;
        int numA4 = 0;
        int A4count = 0;
        int numA5 = 0;
        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag3 = false;
        boolean flag4 = false;
        boolean flag5 = false;
        for (int i = 1; i < numstr.length; i++) {
            num[i] = Integer.parseInt(numstr[i]);
            int tmp = num[i] % 5;
            switch (tmp) {
                case 0: {
                    if (num[i] % 2 == 0) {
                        even = even + num[i];
                        flag1 = true;
                    }
                    break;
                }
                case 1: {
                    if (A2count % 2 == 0) {
                        numA2 = num[i] + numA2;
                    } else {
                        numA2 = numA2 + (-1) * num[i];
                    }
                    A2count++;
                    flag2 = true;
                    break;
                }
                case 2: {
                    A3count++;
                    flag3 = true;
                    break;
                }
                case 3: {
                    A4count++;
                    numA4 = numA4 + num[i];
                    flag4 = true;
                    break;
                }
                case 4: {
                    if (numA5 < num[i]) {
                        numA5 = num[i];
                    }
                    flag5 = true;
                    break;
                }
            }

        }
        DecimalFormat df = new DecimalFormat("0.0");
        String ave = null;
        if (flag4) {
            double res = (double) numA4 / A4count;
            ave = df.format(res);

        } else {
            ave = "N";
        }
        if (flag1) {
            System.out.print(even + " ");
        } else {
            System.out.print("N" + " ");
        }
        if (flag2) {
            System.out.print(numA2 + " ");
        } else {
            System.out.print("N" + " ");
        }
        if (flag3) {
            System.out.print(A3count + " ");

        } else {
            System.out.print("N" + " ");
        }
        System.out.print(ave + " ");
        if (flag5) {
            System.out.print(numA5);
        } else {
            System.out.print("N");
        }

    }
}
//import java.text.DecimalFormat;
//        import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int num = input.nextInt();
//        int sum1 = 0, sum2 = 0, sum3 = 0, sum4 = 0, sum5 = 0;
//        int flag1 = 0, flag2 = 0, flag3 = 0, flag4 = 0, flag5 = 0;
//        int flag = 1;
//        int cnt = 0;
//        DecimalFormat df = new DecimalFormat("#.0");
//        for (int i = 0; i < num; i++) {
//            int x = input.nextInt();
//            if (x % 10 == 0 && x != 0) {
//                sum1 += x;
//                flag1 = 1;
//            }
//            if (x % 5 == 1) {
//                sum2 += flag * x;
//                flag = -1 * flag;
//                flag2 = 1;
//            }
//            if (x % 5 == 2) {
//                sum3++;
//                flag3 = 1;
//            }
//
//            if (x % 5 == 3) {
//                sum4 += x;
//                cnt++;
//                flag4 = 1;
//            }
//            if (x % 5 == 4) {
//                if (sum5 < x) {
//                    sum5 = x;
//                    flag5 = 1;
//                }
//            }
//        }
//        if (flag1 == 1) System.out.print(sum1 + " ");
//        else System.out.print("N ");
//        if (flag2 == 1) System.out.print(sum2 + " ");
//        else System.out.print("N ");
//        if (flag3 == 1) System.out.print(sum3 + " ");
//        else System.out.print("N ");
//        if (flag4 == 1) System.out.print(df.format((float) sum4 / (float) cnt) + " ");
//        else System.out.print("N ");
//        if (flag5 == 1) System.out.print(sum5);
//        else System.out.print("N");
//
//    }
//}
