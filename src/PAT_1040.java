import java.util.Scanner;

/**
 * Created by ZhangZhibo on 2017/2/3.
 */
public class PAT_1040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char tmp = str.charAt(i);
            if (80 == tmp) {
                for (int j = i + 1; j < str.length(); j++) {
                    char c = str.charAt(j);
                    if (65 == c)
                    {
                        for (int k = j+1; k < str.length(); k++) {
                            char t = str.charAt(k);
                            if (84==t)
                            {
                                count++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}
