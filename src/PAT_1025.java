import java.util.*;

/**
 * Created by Gavin.Stevenson on 2017/1/3.
 */
public class PAT_1025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> linkadd = new HashMap<String, String>();
        Map<String, Integer> linknum = new HashMap<String, Integer>();
//        List<String> address = new ArrayList<String>();
        String headaddr = null;
        int num = 0;
        int k = 0;
        headaddr = sc.next();
        num = sc.nextInt();
        k = sc.nextInt();
        String[] address = new String[num];
        for (int i = 0; i < num; i++) {
            String str1 = sc.next();
            linknum.put(str1, sc.nextInt());
            String str2 = sc.next();
            linkadd.put(str1, str2);
        }
//        �Ե�ַ����������λ�ý�������
        address[0] = headaddr;
        for (int i = 1; i < num; i++) {
            address[i] = linkadd.get(address[i - 1]);
        }
//        for (int i = 0; i < num; i++) {
//            System.out.println(linknum.get(address[i]));
//        }
        for (int i = k - 1; i >= 0; i--) {
            System.out.println(address[i] + " " + linknum.get(address[i]) + " " + linkadd.get(address[i]));
        }
        if ((num - k) < k) {
//            ��벿����ת
            for (int i = k; i < num; i++) {
                System.out.println(address[i] + " " + linknum.get(address[i]) + " " + linkadd.get(address[i]));
            }
        } else {
//            ��ת
            for (int i = num - 1; i >= k; i--) {
                System.out.println(address[i] + " " + linknum.get(address[i]) + " " + linkadd.get(address[i]));
            }
        }


    }
}
