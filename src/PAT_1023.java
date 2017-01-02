import java.util.Scanner;
/**
 * Created by Gavin.Stevenson on 2017/1/2.
 */
public class PAT_1023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int [10];
        for (int i = 0; i < 10; i++) {
            num[i] = sc.nextInt();
        }
//        for (int i = 0; i < num.length; i++) {
//            System.out.println(num[i]);
//        }
        StringBuffer sb = new StringBuffer();
        int k = 1;
        while(true)
        {
            if(num[k] != 0)
            {
                sb.append(k);
                num[k]--;
                break;
            }else{
                k++;
            }
        }
        for (int i = 0; i < 10; i++) {
            if(num[i] != 0)
            {
                for (int j = 0; j < num[i]; j++) {
                    sb.append(i);
                }
            }
        }
        System.out.println(sb);
    }
}
