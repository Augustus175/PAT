import java.util.*;

/**
 * Created by Gavin.Stevenson on 2017/2/10.
 */
public class PAT_1059 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();


//        List<String> rank = new ArrayList<String>();

        Map<String, Integer> rank = new HashMap<String, Integer>();

        Map<String, Boolean> finded = new HashMap<String, Boolean>();

        for (int i = 0; i < num; i++) {

            String str = sc.next();

            rank.put(str, i+1);

            finded.put(str, false);
//            rank.add(str);
        }

        int fnum = sc.nextInt();

        String[] find = new String[fnum];

        for (int i = 0; i < fnum; i++) {

            find[i] = sc.next();

        }

        for (int i = 0; i < fnum; i++) {

            if (rank.containsKey(find[i])) {

                if (finded.get(find[i])) {

                    System.out.println(find[i] + ": " + "Checked");

                } else {

                    finded.put(find[i], true);

                    if (rank.get(find[i]) == 1) {

                        System.out.println(find[i] + ": " + "Mystery Award");

                    } else if (isPrime(rank.get(find[i]))) {

                        System.out.println(find[i] + ": " + "Minion");
                    }else{

                        System.out.println(find[i] + ": " + "Chocolate");
                    }
                }

            } else {

                System.out.println(find[i] + ": " + "Are you kidding?");
            }
        }

    }

    public static boolean isPrime(int a) {

        boolean flag = true;

        if (a < 2) {
            return false;
        } else {

            for (int i = 2; i <= Math.sqrt(a); i++) {

                if (a % i == 0) {
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }
}
