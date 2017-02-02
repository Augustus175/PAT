import java.util.Scanner;

/**
 * Created by ZhangZhibo on 2017/2/2.
 */
public class PAT_1040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int Pcount = str.length() - str.replaceAll("P","").length();
        int Acount = str.length() - str.replaceAll("A","").length();
        int Tcount = str.length() - str.replaceAll("T","").length();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==80)
            {
                Pcount--;
                if(Acount>0&&Tcount>0)
                {
                    count = count + Acount*Tcount;
                }
            }else if(str.charAt(i)==65)
            {
                Acount--;
            }else if(str.charAt(i)==84)
            {
                Tcount--;
            }
        }
        System.out.println(count);
    }
}
