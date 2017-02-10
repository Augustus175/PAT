import java.util.Scanner;

/**
 * Created by Gavin.Stevenson on 2017/2/9.
 */
public class PAT_1048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Astr = sc.next();
        String Bstr = sc.next();
        int len = Bstr.length();
        int[] B = new int[len];
        int[] A = new int[len];

        int l = len - Astr.length();
        if (l > 0) {
            for (int i = 0; i < l; i++) {
                Astr = "0" + Astr;
            }
        }
//        将字符串的倒序
        for (int i = 0; i <len; i++) {
            B[len-i-1] = (int) Bstr.charAt(i) - 48;
            A[len-i-1] = (int) Astr.charAt(i) - 48;
        }
        String[] result = new String[B.length];
        for (int i = B.length - 1; i >= 0; i--) {
            if (i % 2 == 0) {
                int tmp = B[i] + A[i];
                tmp = tmp % 13;
                if (10 == tmp) {
                    result[i] = "J";
                } else if (11 == tmp) {
                    result[i] = "Q";
                } else if (12 == tmp) {
                    result[i] = "K";
                } else {
                    result[i] = Integer.toString(tmp);
                }
            } else {
                int var = B[i] - A[i];
                if (var < 0) {
                    var = var + 10;
                }
                result[i] = Integer.toString(var);
            }

        }
        for (int i =  result.length-1; i >=0; i--) {
            System.out.print(result[i]);
        }
        System.out.println();
    }
}
