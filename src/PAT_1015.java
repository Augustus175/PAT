/**
 * Created by thinkpad on 2016/12/3.
 */

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class PAT_1015 {
    public static Map<Integer, Integer> moral = new HashMap<Integer, Integer>();
    public static Map<Integer, Integer> talent = new HashMap<Integer, Integer>();
    public static Map<Integer, Integer> total = new HashMap<Integer, Integer>();
    public static Map<Integer, Integer> index = new HashMap<Integer, Integer>();
    public static int Low = 0;
    public static int High = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int Num = sc.nextInt();
        Low = sc.nextInt();
        High = sc.nextInt();
        int[] stuID = new int[Num];


        for (int i = 0; i < Num; i++) {
            int id = sc.nextInt();
            int m = sc.nextInt();
            int ta = sc.nextInt();
            int to = m + ta;

            moral.put(id, m);
            talent.put(id, ta);
            total.put(id, to);
            index.put(i, id);
            stuID[i] = id;

        }
        for (int i = 0; i < stuID.length - 1; i++) {
            if (compare(stuID[i], stuID[i + 1]) == 1) {
                int k = 0;
                k = stuID[i];
                stuID[i] = stuID[i + 1];
                stuID[i + 1] = k;

            }
        }
        for (int i = 0; i < stuID.length; i++) {
            System.out.print(stuID[i]);
            System.out.print("  ");
            System.out.print(moral.get(stuID[i]));
            System.out.print("  ");
            System.out.println(talent.get(stuID[i]));

        }


    }

    public static int compare(int i, int j) {
        if (moral.get(i) >= Low && talent.get(i) >= Low) {
            if (total.get(i) > total.get(j)) {
                return 0;
            } else {
                if (total.get(i) == total.get(j)) {
                    if (moral.get(i) > moral.get(j)) {
                        return 0;
                    } else {
                        if (moral.get(i) == moral.get(j)) {
                            if (index.get(i) > index.get(j)) {
                                return 1;
                            } else {
                                return 0;
                            }
                        } else {
                            return 1;
                        }
                    }
                } else {
                    return 1;
                }
            }

        } else {
            return -1;
        }

    }
}
