import java.util.*;

/**
 * Created by Gavin.Stevenson on 2017/2/9.
 */
public class PAT_1047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
       List<Integer> arID = new ArrayList<Integer>();
//        Map<String,Integer> score = new HashMap<String,Integer>();
        Map<Integer, Integer> score = new HashMap<Integer, Integer>();
        for (int i = 0; i < num; i++) {
            String str = sc.next();
            int ID = Integer.parseInt(str.split("-")[0]);
            arID.add(ID);
            int s = sc.nextInt();
            if (score.containsKey(ID)) {
                int tmp = score.get(ID) + s;
                score.put(ID, tmp);
            }else{
                score.put(ID,s);
            }
        }
        HashSet h = new HashSet(arID);
        arID.clear();
        arID.addAll(h);
        int result = 0;
        for (int i = 0; i < arID.size(); i++) {
            if(score.get(arID.get(result))<score.get(arID.get(i)))
            {
                result = i;
            }
        }
        System.out.println(arID.get(result)+" "+score.get(arID.get(result)));

    }
}
