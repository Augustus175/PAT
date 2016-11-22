/**
 * Created by Gavin.Stevenson on 2016/11/20.
 */
import java.util.*;

public class PAT_1005 {
//public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = null;
        List<Integer> resault = new ArrayList<Integer>();
        int n = Integer.parseInt(sc.nextLine());
        if (n < 100) {
            Map<Integer, Integer> index = new HashMap<Integer, Integer>();
            Map<Integer, Boolean> data = new HashMap<Integer, Boolean>();
            line = sc.nextLine();

            for (int i = 0; i < n; i++) {
                int m = Integer.parseInt(line.split(" ")[i]);
                if((m > 1 ) &&(m <= 100)) {
                    index.put(i, m);
                    data.put(m, true);
                }
            }
            for (int i = 0; i < index.size(); i++) {
                int d = index.get(i);
                while (d != 1) {
                    if (d % 2 == 0) {
                        d = d / 2;
                    } else {
                        d = (3 * d + 1) / 2;
                    }
                    if (data.containsKey(d)) {
                        data.put(d, false);
                    }
                }
            }

            for (int i = 0; i < index.size(); i++) {
                int j = index.get(i);
                if (data.get(j)) {
                    resault.add(j);
                }
            }
//            调用集合排序函数
//            Collections.sort(resault);
//            for (int i = 0; i < resault.size(); i++) {
//
//                System.out.print(resault.get(i));
//            }
            int[] Resault = new int[resault.size()];
            for (int i = 0; i < resault.size(); i++) {
                Resault[i] = resault.get(i);
            }
            for (int i = 0; i < Resault.length - 1; i++) {
                for (int j = i + 1; j < Resault.length; j++) {
                    if (Resault[i] < Resault[j]) {
                        int temp1 = Resault[i];
                        Resault[i] = Resault[j];
                        Resault[j] = temp1;
                    }
                }
            }
            for (int i = 0; i < Resault.length - 1; i++) {
                System.out.print(Resault[i] + " ");
            }
            System.out.print(Resault[Resault.length - 1]);

        }

    }
}
