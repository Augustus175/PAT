import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
/**
 * Created by thinkpad on 2016/11/25.
 */
public class PAT_1010 {
    public static void main(String[] args) {
        String line = null;
        Scanner sc = new Scanner(System.in);
        line = sc.nextLine();
//        为防止多个空格一定要用这种格式
        String[] numstr = line.split("\\s+");
        int len = numstr.length;
//        int[] num = new int[len];
        List<Integer> num = new ArrayList<Integer>();
        for (int i = 0; i < len - 1; i = i + 2) {
            int n = (Integer.parseInt(numstr[i]));
            int m = (Integer.parseInt(numstr[i + 1]));
            n = n * m;
            m = m - 1;
            if (m != -1) {
                num.add(n);
                num.add(m);

            }

        }
        if (num.size() == 0) {
            System.out.println(0 + " " + 0);
        } else {
            for (int i = 0; i < num.size() - 1; i++) {
                System.out.print(num.get(i) + " ");
            }
            System.out.print(num.get(num.size() - 1));
        }
    }
}
