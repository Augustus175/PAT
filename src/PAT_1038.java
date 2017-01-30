import java.util.Scanner;

/**
 * Created by ZhangZhibo on 2017/1/30.
 */
public class PAT_1038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] score = new int[num];
        for (int i = 0; i < num; i++) {
            score[i] = sc.nextInt();
        }
        int t = sc.nextInt();
        int[] result = new int[t];
        int[] request = new int[t];
        for (int i = 0; i < t; i++) {
            request[i] = sc.nextInt();
        }
//        for (int i = 0; i < num; i++) {
//            System.out.println(score[i]);
//        }
        for (int i = 0; i < t; i++) {
            result[i] = Find(request[i], score);
        }
        for (int i = 0; i < t - 1; i++) {
            System.out.print(result[i]);
            System.out.print(" ");
        }
        System.out.println(result[result.length - 1]);
    }

    public static int Find(int t, int[] score) {
        int count = 0;
        for (int i = 0; i < score.length; i++) {
            if (score[i] == t) {
                count++;
            }
        }
        return count;
    }
}
