/**
 * Created by Gavin.Stevenson on 2016/11/25.
 */
import java.util.Scanner;
public class PAT_1008 {
    public static void main(String[] args) {
        String line = null;
        Scanner sc = new Scanner(System.in);
        line = sc.nextLine();
        int len = Integer.parseInt(line.split(" ")[0]);
        int time = Integer.parseInt(line.split(" ")[1]);
        line = sc.nextLine();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = Integer.parseInt(line.split(" ")[i]);
//            System.out.println(arr[i]);
        }
        for (int i = 0; i < time; i++) {
            arr = arrShift(arr);
        }
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(arr[arr.length - 1]);
    }

    public static int[] arrShift(int[] arr) {
        int tmp = arr[arr.length - 1];
        for (int i = arr.length - 1; i >= 1; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = tmp;
        return arr;
    }
}
