/**
 * Created by thinkpad on 2016/12/3.
 */

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class PAT_1015 {
    //        Map<Integer, String> map =new  HashMap<String, String>();
    public static Map<Integer, Integer> moral = new HashMap<Integer, Integer>();
    public static Map<Integer, Integer> talent = new HashMap<Integer, Integer>();
    public static Map<Integer, Integer> total = new HashMap<Integer, Integer>();
    public static int Low = 0;
    public static int High = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int Num = sc.nextInt();
        Low = sc.nextInt();
        High = sc.nextInt();
        int[] stuID = new int[Num];
//        int[] moral = new int[Num];
//        int[] talent = new int[Num];
//        int[] total = new int[Num];

        for (int i = 0; i < Num; i++) {
            int id = sc.nextInt();
            int m = sc.nextInt();
            int ta = sc.nextInt();
            int to = m + ta;

            moral.put(id, m);
            talent.put(id, ta);
            total.put(id, to);
            stuID[i] = id;
//            moral[i] = m;
//            talent[i] = ta;
//            total[i] = to;
//            map.put()
        }
//        for (int i = 0; i < Num; i++) {
//            System.out.println(stuID[i]);
//            System.out.println(moral[i]);
//            System.out.println(talent[i]);
//            System.out.println(total[i]);
//        }

    }

    public static int compare(int i, int j) {
        if (moral.get(i) >= Low && talent.get(i) >= Low)
        {

        }else
        {
            return -1;
        }

    }
}
