import java.util.Scanner;

/**
 * Created by ZhangZhibo on 2017/1/28.
 */
public class PAT_1036 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = sc.next();
        double weigth = (int) Math.ceil((double) num / 2);

        for (int i = 1; i <= num; i++) {
            System.out.print(str);
        }
        System.out.println();
        for (int i = 1; i <= weigth - 2; i++) {
            System.out.print(str);
            for (int j = 2; j <= num - 1; j++) {
                System.out.print(" ");
            }
            System.out.println(str);
        }
        for (int i = 1; i <= num; i++) {
            System.out.print(str);
        }

    }
}
