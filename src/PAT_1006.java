/**
 * Created by Gavin.Stevenson on 2016/11/21.
 */
import java.util.Scanner;
public class PAT_1006 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        StringBuffer sb = new StringBuffer();
        if((num >0)&&(num < 1000))
        {
           int single = num % 10;
            num = num /10;
            for (int i = 1; i <=single; i++) {
                sb.append(i);
            }
            int ten = num % 10;
            num = num /10;
            for (int i = 0; i < ten; i++) {
                sb.insert(0,"S");
            }
            for (int i = 0; i < num; i++) {
                sb.insert(0,"B");
            }
        }
        System.out.println(sb.toString());
    }
}
