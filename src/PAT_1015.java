/**
 * Created by thinkpad on 2016/12/3.
 */

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class PAT_1015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Num = sc.nextInt();
        int Low = sc.nextInt();
        int High = sc.nextInt();
        int[] stuID = new int[Num];
        int[] moral = new int[Num];
        int[] talent = new int[Num];
        int[] total = new int[Num];
//        Map<Integer, String> map =new  HashMap<String, String>();
//        Map<Integer,Integer> moral = new HashMap<Integer,Integer>();
//        Map<Integer,Integer> talent = new HashMap<Integer,Integer>();
//        Map<Integer,Integer> total = new HashMap<Integer,Integer>();
        for (int i = 0; i < Num; i++) {
            int id = sc.nextInt();
            int m = sc.nextInt();
            int ta = sc.nextInt();
            int to = m + ta;
            stuID[i] = id;
            moral[i] = m;
            talent[i] = ta;
            total[i] = to;
//            map.put()
        }
        for (int i = 0; i < Num; i++) {
            System.out.println(stuID[i]);
            System.out.println(moral[i]);
            System.out.println(talent[i]);
            System.out.println(total[i]);
        }

    }
}
