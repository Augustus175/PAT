import java.util.Scanner;

/**
 * Created by Gavin.Stevenson on 2017/1/1.
 */
public class PAT_1021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] num = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
//        int[] num1 = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
//        System.out.println(num.length);
//        System.out.println(str);
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
//            System.out.println(c);
            switch (c) {
                case 48:
                    num[0]++;
                    break;
                case 49:
                    num[1]++;
                    break;
                case 50:
                    num[2]++;
                    break;
                case 51:
                    num[3]++;
                    break;
                case 52:
                    num[4]++;
                    break;
                case 53:
                    num[5]++;
                    break;
                case 54:
                    num[6]++;
                    break;
                case 55:
                    num[7]++;
                    break;
                case 56:
                    num[8]++;
                    break;
                case 57:
                    num[9]++;
                    break;

            }
        }
        for (int i = 0; i < num.length; i++) {
            if (num[i] != 0) {
                System.out.println(i + ":" + num[i]);
            }
        }
    }

}
