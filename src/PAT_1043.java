import java.util.Scanner;

/**
 * Created by Gavin.Stevenson on 2017/2/8.
 */
public class PAT_1043 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] num = new int[6];
        num[0] = str.length() - str.replaceAll("P", "").length();
        num[1] = str.length() - str.replaceAll("A", "").length();
        num[2] = str.length() - str.replaceAll("T", "").length();
        num[3] = str.length() - str.replaceAll("e", "").length();
        num[4] = str.length() - str.replaceAll("s", "").length();
        num[5] = str.length() - str.replaceAll("t", "").length();
        int max = -1;
        for (int i = 0; i < 6; i++) {
            if (max < num[i]) {
                max = num[i];
            }
        }
        for (int i = 0; i < max; i++) {
            if (num[0] > 0) {
                System.out.print("P");
                num[0]--;
            }
            if (num[1] > 0) {
                System.out.print("A");
                num[1]--;
            }
            if (num[2] > 0) {
                System.out.print("T");
                num[2]--;
            }
            if (num[3] > 0) {
                System.out.print("e");
                num[3]--;
            }
            if (num[4] > 0) {
                System.out.print("s");
                num[4]--;
            }
            if (num[5] > 0) {
                System.out.print("t");
                num[5]--;
            }
        }
    }


}
