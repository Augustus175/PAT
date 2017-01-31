import java.util.Scanner;

/**
 * Created by ZhangZhibo on 2017/1/31.
 */
public class PAT_1039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String provide = sc.next();
        String want = sc.next();

        char[] wan = want.toCharArray();

        int[] re = find(provide, wan);
        if (0 == re[1]) {
            System.out.print("Yes" + " " + re[0]);
        } else {
            System.out.print("No" + " " + re[1]);
        }
    }

    public static int[] find(String pro, char[] wan) {
        int[] result = {0, 0};
        String save = pro;

        for (int i = 0; i < wan.length; i++) {
            if (pro.indexOf(wan[i]) >= 0) {
                pro = pro.replaceFirst(String.valueOf(wan[i]), "");
            } else {
                result[1]++;
            }
        }
        if (result[1] == 0) {
            result[0] = save.length() - pro.length() + 1;
        }
        return result;
    }
}
