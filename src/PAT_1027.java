import java.util.Scanner;

/**
 * Created by Gavin.Stevenson on 2017/1/4.
 */
public class PAT_1027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = sc.next();
        int n = 0;
        int i = 1;
        int count = 6;
        int sum = 6;
        if (num >= 7) {
//            当所给大于7的时候沙漏超过1行，所给小于7，只能打印一行
//            计算所能打印的最大行数num-1是为了留一个打印中心，这样其他的就是首项为6公差为4的等差数列了
            while (sum < num - 1) {
                count = count + 4;
                sum = sum + count;
                n++;
            }
            count = count - 4;
//            System.out.println(n);
//            打印下半部沙漏
            int m = n - 1;
            int counttmp1 = count;
//            System.out.println(count);
            for (int j = 0; j < m + 2; j++) {
                for (int k = 0; k < (count / 2 - counttmp1 / 2) / 2; k++) {
                    System.out.print(" ");
                }
                for (int k = counttmp1 / 2; k > 0; k--) {
                    System.out.print(str);
                }
                System.out.println();
                counttmp1 = counttmp1 - 4;
            }
//            打印下半部沙漏，以行数m作为标识
            int t = m;
            for (int j = 1; j < m + 2; j++) {
                for (int k = t; k > 0; k--) {
                    System.out.print(" ");
                }
                for (int k = 0; k < (2 * j + 1); k++) {
                    System.out.print(str);
                }
                System.out.println();
                t = t - 1;
            }
//          计算剩余的符号数
            int lcount = (6+2*(m))*(m+1)+1;

//            System.out.println(lcount);
            System.out.println(num -lcount);
        } else {

            System.out.println(str);
            System.out.println(num - 1);
        }

    }
}
