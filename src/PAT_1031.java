import java.util.Scanner;

/**
 * Created by Gavin.Stevenson on 2017/1/11.
 */
public class PAT_1031 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String[] str = new String[num];
        boolean[] flag = new boolean[num];
        for (int i = 0; i < num; i++) {
            flag[i] = true;
        }
        int[] weight = {7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2};
        char[] M = {49,48,88,57,56,55,54,53,52,51,50};
        for (int i = 0; i < num; i++) {
            str[i] = sc.next();
        }
        for (int i = 0; i < num; i++) {
            char[] ch = new char[18];
            for (int j = 0; j < 17; j++) {
                char c = str[i].charAt(j);
                if ((c >= 48) && (c <= 57)) {
                    ch[j] = c;
                } else {
                    flag[i] = false;
                }
            }
            ch[17]=str[i].charAt(17);
            if (flag[i]) {
                int and = 0;
                for (int j = 0; j < 17; j++) {
                    and =and + (int) (ch[j] - 48) * weight[j];
                }
                int rem = and % 11;
                if(M[rem]!=ch[17])
                {
                    flag[i] = false;
                }

            }
        }
        boolean flagAll = true;
        for (int i = 0; i < num; i++) {
            if(!flag[i])
            {
                System.out.println(str[i]);
                flagAll = false;
            }
        }
        if(flagAll)
        {
            System.out.print("All passed");
        }

    }
}
