import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by thinkpad on 2017/1/3.
 */
public class PAT_1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C1 = sc.nextInt();
        int C2 = sc.nextInt();
        int hour = (C2 - C1) / (100 * 60 * 60);
        int min = (C2 - C1) / (100 * 60) - hour * 60;
        double dousecond = (double) (C2 - C1) / (100) - hour * 60 * 60 - min * 60;
        long second = Math.round(dousecond);

//        System.out.println(C1);
//        System.out.println(C2);
        DecimalFormat df = new DecimalFormat("00");
        String strhour = String.format("%02d", hour);
        String strmin = String.format("%02d", min);
        String strsecond = String.format("%02d", second);
        System.out.print(strhour + ":" + strmin + ":" + strsecond);
    }
}
