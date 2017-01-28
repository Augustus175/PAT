import java.util.Scanner;

/**
 * Created by ZhangZhibo on 2017/1/28.
 */
public class PAT_1036 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = sc.next();
        int weigth = (int) Math.rint((double) num / 2);
        System.out.println(weigth);
        if (num >= 3 && num <= 20) {
//        System.out.println(weigth);
//        System.out.println((int) Math.rint((double) num / 2));
            for (int i = 0; i < num; i++) {
                System.out.print(str);
            }
            System.out.println();
            for (int i = 0; i < weigth - 2; i++) {
                System.out.print(str);
                for (int j = 0; j < num - 2; j++) {
                    System.out.print(" ");
                }
                System.out.println(str);
            }
            for (int i = 0; i < num; i++) {
                System.out.print(str);
            }
//        System.out.println(num);
//        System.out.println(str);
        }
    }
}
