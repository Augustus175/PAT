import java.util.Scanner;

/**
 * Created by ZhangZhibo on 2017/1/30.
 */
public class PAT_1037 {
    public static void main(String[] args) {
        int[] Pnum = new int[3];
        int[] Anum = new int[3];
        int[] result = new int[3];
        Scanner sc = new Scanner(System.in);
        String Pstr = sc.next();
        String Astr = sc.next();

        for (int i = 0; i < 3; i++) {
            Pnum[i] = Integer.parseInt(Pstr.split("\\.")[i]);
            Anum[i] = Integer.parseInt(Astr.split("\\.")[i]);
            result[i] = Integer.parseInt(Pstr.split("\\.")[i]) - Integer.parseInt(Astr.split("\\.")[i]);
        }
        int P = Pnum[0] * 17 * 29 + Pnum[1] * 29 + Pnum[2];
        int A = Anum[0] * 17 * 29 + Anum[1] * 29 + Anum[2];
        int re = A - P;
        System.out.println(re);
        boolean flag = false;
        if (re < 0) {
            flag = true;
            re = -re;
        }
        result[0] = re / (17 * 29);
        re = re - result[0] * 17 * 29;
        result[1] = re / 29;

        result[2] = re - result[1] * 29;
        if (flag) {
            result[0] = -result[0];
        }
        System.out.println(result[0] + "." + result[1] + "." + result[2]);
    }
}
