import java.util.Scanner;

/**
 * Created by Gavin.Stevenson on 2016/12/26.
 */
public class PAT_1016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int DA = sc.nextInt();
        int B = sc.nextInt();
        int DB = sc.nextInt();
        int a = newNum(A, DA);
        int b = newNum(B, DB);
        System.out.println(a + b);
    }
    public static int newNum(int a, int da) {
        boolean flag = false;
        int newnum = 1;
        for (int i = a; i != 0; i = i / 10) {
            int j = i % 10;
            if (j == da) {
                flag = true;
                newnum = newnum * 10;
            }
        }
        if (flag) {
            newnum = da * ((newnum - 1) / 9);
            return newnum;
        } else {
            return 0;
        }
    }
}
