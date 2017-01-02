import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by thinkpad on 2017/1/1.
 */
public class PAT_1022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int D = sc.nextInt();
        int tmp = A + B;
        int least = -1;
        List<Integer> result = new ArrayList<Integer>();
        do
        {
            result.add(tmp % D);
            tmp = tmp / D;

        }while (tmp != 0);
        for (int i = result.size()-1; i >= 0; i--) {
            System.out.print(result.get(i));
        }
//        System.out.println(A);
//        System.out.println(B);
//        System.out.println(D);
//        System.out.println(tmp);
    }

}
