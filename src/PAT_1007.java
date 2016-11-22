/**
 * Created by thinkpad on 2016/11/21.
 */

import java.util.Scanner;

public class PAT_1007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
//        System.out.println(num);
        int count = 0;
        if (num > 2) {
            for (int i = 1; i <= num - 2; i++) {
                if ((isPrime(i)) && (isPrime(i + 2))) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static boolean isPrime(int a) {

        boolean flag = true;

        if (a < 2) {
            return false;
        } else {

            for (int i = 2; i <= Math.sqrt(a); i++) {

                if (a % i == 0) {
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }
}
