import java.util.Scanner;

/**
 * Created by Gavin.Stevenson on 2017/1/4.
 */
public class PAT_1027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = sc.next();
        int n = 0;
        int i = 1;
        int count = 0;
        if(num>=7){
            while (n < num) {
                count++;
                i = 2 * count + 4;
                n = n + i;
            }
        }else{
            System.out.println(str);
        }
//        System.out.println(num + "  " + str);
    }
}
