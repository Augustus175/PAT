import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Gavin.Stevenson on 2017/2/10.
 */
public class PAT_1049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        double[] unit = new double[num];
        for (int i = 0; i < num; i++) {
            unit[i] = sc.nextDouble();
        }
        double count = 0;
        for (int i = 0; i < num; i++) {
//            count = count + unit[i];
            double tmp = unit[i];
            for (int j = i+1; j < num; j++) {
                count = count + tmp;
                tmp = tmp + unit[j];
            }
            count = count + tmp;
        }
//        count = (double)(Math.round(count*100)/100.00);
//        System.out.println(count);
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println(df.format(count));
    }
}
