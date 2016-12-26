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
        System.out.println(A);
        System.out.println(DA);
        System.out.println(B);
        System.out.println(DB);
        newNum(A, 1);
    }

    public static int newNum(int a, int da) {
        int newnum = 0;
        for (int i = a; i != 0; i = i / 10) {
            int j = i % 10;
            if (j == da) {
                if (newnum == 0) {
                    newnum = 1;
                } else {
                    newnum = newnum * 10;
                }
            }
            System.out.println(j);
        }
        if (newnum != 0) {
            newnum = da * ((newnum - 1) / 9);
            System.out.println("-----------------------------------------");
            System.out.println(newnum);
            return newnum;
        } else {
            return -1;
        }


    }
}
