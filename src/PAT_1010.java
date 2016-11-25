import java.util.Scanner;

/**
 * Created by thinkpad on 2016/11/25.
 */
public class PAT_1010 {
    public static void main(String[] args) {
        String line = null;
        Scanner sc = new Scanner(System.in);
        line = sc.nextLine();
        String[] numstr = line.split(" ");
        int len = numstr.length;
        int[] num = new int[len];
        for (int i = 0; i < len; i++) {
            num[i] = Integer.parseInt(numstr[i]);
        }
        if(num[len -1] == 0)
        {
            for (int i = 0; i < len-2; i= i+2) {
                num[i] = num[i] * num[i+1];
                num[i+1]--;
            }
        }
        else {
            for (int i = 0; i < len; i= i+2) {
                num[i] = num[i] * num[i+1];
                num[i+1]--;
            }
        }
        boolean flag = true;
        for (int i = 0; i < num.length - 1; i++) {
            if(num[i] == 0)
            {
                flag = false;
                System.out.print(num[i] + " ");
               
            }
        }
        System.out.println(num[num.length - 1]);
    }
}
