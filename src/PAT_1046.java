import java.util.Scanner;

/**
 * Created by Gavin.Stevenson on 2017/2/9.
 */
public class PAT_1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int Acout = 0;
        int Bcout = 0;
        int[] unit = new int[num * 4];
        for (int i = 0; i < num * 4; i++) {
            unit[i] = sc.nextInt();
        }
        for (int i = 0; i < num * 4; i = i + 4) {
//            System.out.println(unit[i]);
            boolean flagA = false;
            boolean flagB = false;
            int sum = unit[i] + unit[i + 2];
            if (sum == unit[i+1])
            {
                flagA = true;
            }
            if (sum == unit[i+3])
            {
                flagB = true;
            }
            if(flagA&&(!flagB))
            {
                Bcout++;
            }
            if(flagB&&(!flagA))
            {
                Acout++;
            }
        }
        System.out.println(Acout+" "+Bcout);
    }
}
