import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Gavin.Stevenson on 2017/2/10.
 */
public class PAT_1063 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = 2 * sc.nextInt();

        int[] unit = new int[num];

        for (int i = 0; i < num; i++) {

            unit[i] = sc.nextInt();

        }

        double max = 0;

        for (int i = 0; i < num; i = i + 2) {

            double tmp = Math.pow(unit[i], 2) + Math.pow(unit[i + 1], 2);

            if (max < tmp) {

                max = tmp;

            }
//            tmp = Math.sqrt(tmp);

        }

        max = Math.sqrt(max);

        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println(df.format(max));
    }
}
