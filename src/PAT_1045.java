import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Gavin.Stevenson on 2017/2/9.
 */
public class PAT_1045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        List<Integer> resault = new ArrayList<Integer>();
        int[] unit = new int[num];
        for (int i = 0; i < num; i++) {
            unit[i] = sc.nextInt();
        }
        for (int i = 0; i < num; i++) {
//            System.out.println(unit[i]);
            boolean flag1 = true;
            boolean flag2 = true;
            for (int j = i - 1; j >= 0; j--) {
                if (unit[j] > unit[i]) {
                    flag1 = false;
                    break;
                }
            }
            for (int j = i + 1; j < num; j++) {
                if (unit[j] < unit[i]) {
                    flag1 = false;
                    break;
                }
            }
            if (flag1&&flag2) {
                resault.add(unit[i]);
            }
        }
        int l = resault.size();
        System.out.println(l);
        for (int i = 0; i < l - 1; i++) {
            System.out.print(resault.get(i) + " ");
        }
        System.out.println(resault.get(l - 1));
    }
}
