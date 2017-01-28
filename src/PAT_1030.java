import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Gavin.Stevenson on 2017/1/10.
 */
public class PAT_1030 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int[] num = new int[n];
        int[] num_p = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        Arrays.sort(num);
        for (int i = 0; i < n; i++) {
            num_p[i] = num[i] * p;
//            System.out.print(" ");
//            System.out.print(num[i]);
        }
        int max = 0;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                if (num[i] <= num_p[j]) {
                    int t = (i - j + 1);
                    if (t > max) {
                        max = t;
                    }
                }
            }
        }
        System.out.println(max);
    }
}
