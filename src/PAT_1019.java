import java.util.Scanner;

/**
 * Created by thinkpad on 2016/12/30.
 */
public class PAT_1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] tmp;
        if (num % 1111 == 0) {
            System.out.print(num + " - " + num + " = 0000");
        } else {
            while (num != 6174) {
                tmp = getUnit(num);
                num = lessSort(tmp) - greaterSort(tmp);
                String str = String.format("%04d", greaterSort(tmp));
                System.out.println(lessSort(tmp) + " - " + str + " = " + num);
            }
        }
    }

    public static int[] getUnit(int num) {
        int[] arr = new int[4];
        int i = 0;
        while (num != 0) {

            arr[i] = num % 10;
            i++;
            num = num / 10;
        }
        return arr;
    }

    //非递减排序，可能出现首位为零的情况
    public static int greaterSort(int[] n) {
        int tmp;
        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 4; j++) {
                if (n[i] > n[j]) {
                    tmp = n[i];
                    n[i] = n[j];
                    n[j] = tmp;
                }
            }
        }
        int re = n[0] * 1000 + n[1] * 100 + n[2] * 10 + n[3];
        return re;
    }

    //非递增排序
    public static int lessSort(int[] m) {
        int tmp;
        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 4; j++) {
                if (m[i] < m[j]) {
                    tmp = m[i];
                    m[i] = m[j];
                    m[j] = tmp;
                }
            }
        }
        int re = m[0] * 1000 + m[1] * 100 + m[2] * 10 + m[3];
        return re;
    }
}
