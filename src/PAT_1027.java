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
        } else {
            System.out.println(str);
        }
//        System.out.println(num + "  " + str);
        System.out.println(n);
        int m = n - 1;
        int counttmp = count;
        System.out.println(count);
        for (int j = 0; j < m; j++) {
            for (int k = counttmp / 2; k > 0; k--) {
                System.out.print(str);
            }
            System.out.println();
            counttmp = counttmp - 4;
        }
    }
}
