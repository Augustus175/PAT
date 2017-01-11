import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by thinkpad on 2017/1/11.
 */
public class PAT_1032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Map<Integer, Integer> score = new HashMap<Integer, Integer>();
        Map<Integer, Integer> index = new HashMap<Integer, Integer>();
        for (int i = 0; i < num; i++) {
            int per = sc.nextInt();
            int sco = sc.nextInt();
            if (score.containsKey(per)) {
                int count = sco + score.get(per);
                score.put(per, count);
            } else {
                score.put(per, sco);
            }
        }
        for (int i = 0; i < score.size(); i++) {

        }
        int i = 0;
        for (Map.Entry entry : score.entrySet()) {
            int key = (int) entry.getKey();
            index.put(i, key);
            i++;
        }
        int maxindex = 0;
        int max = 0;
        for (int j = 0; j < index.size(); j++) {
            if (max < score.get(index.get(j))) {
                maxindex = index.get(j);
                max = score.get(index.get(j));
            }
        }
        System.out.println(maxindex + " " + max);

    }
}
