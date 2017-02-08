import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Gavin.Stevenson on 2017/2/7.
 */
public class PAT_1041 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Map<Integer,String>stunum= new HashMap<Integer,String>();
        Map<Integer,Integer>location= new HashMap<Integer,Integer>();
        for (int i = 0; i < num; i++) {
            String str = sc.next();
            int test = sc.nextInt();
            int loca = sc.nextInt();
            stunum.put(test,str);
            location.put(test,loca);
        }
        int requestnum = sc.nextInt();
        int[] request = new int[requestnum];
        for (int i = 0; i < requestnum; i++) {
            request[i] = sc.nextInt();
        }
        for (int i = 0; i < requestnum; i++) {
            System.out.println(stunum.get(request[i])+" "+location.get(request[i]));
        }
    }
}
