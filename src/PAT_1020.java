import java.util.Scanner;
/**
 * Created by thinkpad on 2016/12/31.
 */
public class PAT_1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int var = sc.nextInt();
        int need = sc.nextInt();
        int[] stor = new int[var];
        int[] totpri = new int[var];
        for (int i = 0; i < var; i++) {
            stor[i] = sc.nextInt();
        }
        for (int i = 0; i < var; i++) {
            totpri[i] = sc.nextInt();
        }
//        System.out.println(var);
//        System.out.println(need);
//        for (int i = 0; i < var; i++) {
//            System.out.println(stor[i]);
//            System.out.println(totpri[i]);
//        }
    }
}
