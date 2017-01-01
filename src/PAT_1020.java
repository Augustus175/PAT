import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by thinkpad on 2016/12/31.
 * ������ʵ�ֲ����������ⵥ�۹�ģ��Ե��۽�������Ȼ��һ���������Ĵι���ٴι���Դ�����
 */
public class PAT_1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int var = sc.nextInt();
        int need = sc.nextInt();
        Map<Integer, Double> price = new HashMap<Integer, Double>();
        int[] stor = new int[var];
        for (int i = 0; i < var; i++) {
            stor[i] = sc.nextInt();
        }
        for (int i = 0; i < var; i++) {
            int totpri = sc.nextInt();
            double tmp = (double) totpri / stor[i];
            price.put(stor[i], tmp);
        }
        for (int i = 0; i < var - 1; i++) {
            for (int j = i + 1; j < var; j++) {
                if (price.get(stor[i]) < price.get(stor[j])) {
                    int t = stor[i];
                    stor[i] = stor[j];
                    stor[j] = t;
                }
            }
        }
        int beyond = need;
        int k = 0;
//        ����Ϊ�˶Ե��۽�������
        do {
            beyond = beyond - stor[k];
            k++;
        } while (beyond > 0);
        double profit = 0;
        for (int i = 0; i < k - 1; i++) {
            profit = stor[i] * price.get(stor[i]);
        }
//        beyond ������ŵ��ڴ�ͻ��
        profit = profit + (stor[k-1]+beyond)*price.get(stor[k-1]);
        System.out.println(String.format("%.2f",profit));
//        System.out.println(k);
//        for (int i = 0; i < k - 1; i++) {
//            System.out.println("-------------------------------");
//            System.out.println(stor[i]);
//        }
//        System.out.println(stor[k - 1]+beyond);

//        for (int i = 0; i < var; i++) {
//            System.out.println(price.get(stor[i]));
//        }
//        System.out.println(var);
//        System.out.println(need);
//        for (int i = 0; i < var; i++) {
//            System.out.println(stor[i]);
//            System.out.println(totpri[i]);
//        }
    }
}
