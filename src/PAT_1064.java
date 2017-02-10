import java.util.*;

/**
 * Created by Gavin.Stevenson on 2017/2/10.
 */
public class PAT_1064 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int[] unit = new int[num];

        for (int i = 0; i < num; i++) {

            unit[i] = sc.nextInt();
        }

        List<Integer> result = new ArrayList<Integer>();

        for (int i = 0; i < num; i++) {

            int t1 = unit[i];
            int t2 = 0;
            int c = 0;
            do {

                t2 = t1 % 10;

                c = c + t2;

                t1 = t1 / 10;


            } while (t1 != 0);

            result.add(c);
        }

        Set h = new HashSet(result);

        result.clear();

        result.addAll(h);

        int l =result.size();

        Collections.sort(result);

        System.out.println(l);

        for (int i = 0; i <l-1; i++) {

            System.out.print(result.get(i) + " ");
        }

        System.out.println(result.get(l-1));
    }
}
