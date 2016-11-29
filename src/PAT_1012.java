/**
 * Created by Gavin.Stevenson on 2016/11/29.
 */
import java.util.Scanner;
public class PAT_1012 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] numstr = line.split("\\s+");
//        for (int i = 0; i < numstr.length; i++) {
//            System.out.println(numstr[i]);
//        }
        int[] num = new int[numstr.length];
        int even = 0;
        int[] numA2 = null;
        for (int i = 0; i < numstr.length; i++) {
            num[i] = Integer.parseInt(numstr[i]);
            if((num[i] % 5 == 0)&&(num[i] % 2 == 0))
            {
                even = even + num[i];
            }else if () {
            }
        }
        if()
    }
}
