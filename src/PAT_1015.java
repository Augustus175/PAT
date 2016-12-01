/**
 * Created by thinkpad on 2016/12/1.
 */
import java.util.Scanner;
public class PAT_1015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        int max = sc.nextInt();
        int count = 0;
        for (int i = min; i <= max; i++) {

            if (isPrime(i))
            {
                System.out.print(i);
                System.out.print(" ");
                count ++;
                if((count % 10 == 0)&&(count != 0))
                {
                    System.out.println();
                }
            }
        }
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
