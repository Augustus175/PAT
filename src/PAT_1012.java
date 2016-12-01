/**
 * Created by Gavin.Stevenson on 2016/11/29.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class PAT_1012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int tmp = 0;
        int rem = 0;
        int countA1 = 0;
        int countA2 = 0;
        int countA3 = 0;
        int countA4 = 0;
        int countA5 = 0;
        int numA1 = 0;
        int numA2 = 0;
        int numA4 = 0;
        int numA5 = 0;
        for (int i = 0; i < num; i++) {
            tmp = sc.nextInt();
            rem = tmp % 5;
            switch (rem) {
                case 0: {
                    if (tmp % 2 == 0) {
                        numA1 = numA1 + tmp;
                        countA1 = 1;
                    }
                    break;
                }
                case 1: {
                    if (countA2 % 2 == 0) {
                        numA2 = tmp + numA2;
                    } else {
                        numA2 = numA2 + (-1) * tmp;
                    }
                    countA2++;
                    break;
                }
                case 2: {
                    countA3++;
                    break;
                }
                case 3: {
                    countA4++;
                    numA4 = numA4 + tmp;
                    break;
                }
                case 4: {
                    if (numA5 < tmp) {
                        numA5 = tmp;
                    }
                    countA5 = 1;
                    break;
                }
            }
        }
        DecimalFormat df = new DecimalFormat("0.0");
        if (countA1 != 0) {
            System.out.print(numA1 + " ");
        } else {
            System.out.print("N" + " ");
        }
        if (countA2 != 0) {
            System.out.print(numA2 + " ");
        } else {
            System.out.print("N" + " ");
        }
        if (countA3 != 0) {
            System.out.print(countA3 + " ");

        } else {
            System.out.print("N" + " ");
        }
        if (countA4 != 0) {
            System.out.print(df.format((float) numA4 / (float) countA4) + " ");
        } else {
            System.out.print("N" + " ");
        }
        if (countA5 != 0) {
            System.out.print(numA5);
        } else {
            System.out.print("N");
        }
    }
}

