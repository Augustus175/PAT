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
        long[][] longnum = new long[num][3];
        for (int i = 0; i < num; i++) {
            line = sc.nextLine();
            longnum[i][0] = Long.parseLong(line.split("\\s+")[0]);
            longnum[i][1] = Long.parseLong(line.split("\\s+")[1]);
            longnum[i][2] = Long.parseLong(line.split("\\s+")[2]);
        }
        for (int i = 0; i < num; i++) {
            System.out.println("Case #"+i+": "+Com((longnum[i][0]+longnum[i][1]),longnum[i][2]));
        }
    }

    public static boolean Com( long longnumAB,long longnumC) {
        if(longnumAB > longnumC)
        {
            return false;
        }
        else
        {
            return true;
        }

    }
}
