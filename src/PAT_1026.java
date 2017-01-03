import java.util.Scanner;

/**
 * Created by thinkpad on 2017/1/3.
 */
public class PAT_1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double C1 = sc.nextDouble();
        double C2 = sc.nextDouble();
        double second = (C2 - C1) / 18.2;
        double min = second / 60;
        double hour = min / 60;
        double tim = hour / 60;

        System.out.println(C1);
        System.out.println(C2);
        System.out.println(second);
        System.out.println(min);
        System.out.println(hour);
        System.out.println(tim);
    }
}
