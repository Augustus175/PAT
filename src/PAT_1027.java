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
//            ����������7��ʱ��ɳ©����1�У�����С��7��ֻ�ܴ�ӡһ��
//            �������ܴ�ӡ���������num-1��Ϊ����һ����ӡ���ģ����������ľ�������Ϊ6����Ϊ4�ĵȲ�������
            while (sum < num - 1) {
                count = count + 4;
                sum = sum + count;
                n++;
            }
            count = count - 4;
//            System.out.println(n);
//            ��ӡ�°벿ɳ©
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
//            ��ӡ�°벿ɳ©��������m��Ϊ��ʶ
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
//          ����ʣ��ķ�����
            int lcount = (6+2*(m))*(m+1)+1;

//            System.out.println(lcount);
            System.out.println(num -lcount);
        } else {

            System.out.println(str);
            System.out.println(num - 1);
        }

    }
}
