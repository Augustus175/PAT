import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Gavin.Stevenson on 2017/2/10.
 */
public class PAT_1053 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        double e = sc.nextDouble();

        int D = sc.nextInt();

        int[] time = new int[N];

        int[] restime = new int[N];

        double[][] survey = new double[N][];

        for (int i = 0; i < N; i++) {

            time[i] = sc.nextInt();

            for (int j = 0; j < time[i]; j++) {

                survey[i][j] = sc.nextDouble();
            }

        }

        for (int i = 0; i < N; i++) {

            for (int j = 0; j < time[i]; j++) {

                if (survey[i][j] < e) {

                    restime[i]++;
                }
            }

        }
        int perban = 0;

        int ban = 0;

        for (int i = 0; i < N; i++) {

            if (restime[i] > D) {

                ban++;

            } else {

                double t = (double) restime[i] / time[i];

                if (t > 0.5) {

                    perban++;
                }
            }
        }

        DecimalFormat df = new DecimalFormat("0.0");

        double r1 = (double) perban / N * 100;

        double r2 = (double) ban / N * 100;

        System.out.println(df.format(r1+"% "+r2+"%"));

    }
}
