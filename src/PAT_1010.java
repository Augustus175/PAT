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
        Boolean flag = false;
        if((num[1] ==0)&&(num[0] == 0))
        {
//            System.out.print(0+" "+0);
        }
        else {

                if(num[num.length-1] == 0)
                {
                    flag = true;
                }
                for (int i = 0; i < len - 1; i = i + 2) {
                    if(num[i+1]==0)
                    {
                        num[i] = 0;
                        num[i+1] = 0;
                    }else {
                        num[i] = num[i] * num[i + 1];
                        num[i + 1]--;
                    }
                }
            if(flag)
            {
                for (int i = 0; i < num.length - 3; i++) {
                    System.out.print(num[i] + " ");
                }
                System.out.print(num[num.length - 3]);
            }else {
                for (int i = 0; i < num.length - 1; i++) {
                    System.out.print(num[i] + " ");
                }
                System.out.print(num[num.length - 1]);
            }
        }

    }
}
