import java.util.Scanner;

/**
 * Created by Gavin.Stevenson on 2017/2/10.
 */
public class PAT_1056 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int[] unit = new int[num];

        for (int i = 0; i < num; i++) {

            unit[i] = sc.nextInt();
        }

        int count = 0;

        for (int i = 0; i < num; i++) {

            for (int j = i + 1; j < num; j++) {

                int t1 = unit[i] * 10 + unit[j];

                int t2 = unit[j] * 10 + unit[i];

                count = count + t1 + t2;
            }

        }

        System.out.println(count);
    }
}
