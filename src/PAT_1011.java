import java.util.Scanner;

/**
 * Created by thinkpad on 2016/11/27.
 */
public class PAT_1011 {
    public static void main(String[] args) {
        int num = 0;
        String line = null;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
//        不知道为啥这里要向下定位一行
        sc.nextLine();
        long[][] longnum = new long[num][3];
        for (int i = 0; i < num; i++) {
            line = sc.nextLine();
            longnum[i][0] = Long.parseLong(line.split("\\s+")[0]);
            longnum[i][1] = Long.parseLong(line.split("\\s+")[1]);
            longnum[i][2] = Long.parseLong(line.split("\\s+")[2]);

        }
        for (int i = 0; i < num; i++) {
            int j = i+1;
            System.out.println("Case #"+j+": "+Com((longnum[i][0]+longnum[i][1]),longnum[i][2]));
        }
    }

    public static boolean Com( long longnumAB,long longnumC) {
        if(longnumAB > longnumC)
        {
            return true;
        }
        else
        {
            return false;
        }

    }
}
