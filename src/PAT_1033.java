import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Gavin.Stevenson on 2017/1/12.
 */
public class PAT_1033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String broken = sc.next();
        String normal = sc.next();
        char[] bch = broken.toCharArray();
        boolean flag = false;

//        System.out.println(broken);
//        System.out.println(normal);
//        char underline = 95;
        for (int i = 0; i < bch.length; i++) {
            if (bch[i] == 43) {
                flag = true;
            }
            if ((bch[i] >= 65) && (bch[i] <= 90)) {
                char lower = (char) (bch[i] + 32);
                normal = normal.replace(String.valueOf(lower), "");
            }
            if (bch[i] == 46) {
                normal = normal.replace(".", "");
            } else {
                normal = normal.replace(String.valueOf(bch[i]), "");
//           normal= normal.replace("7", "");
            }
        }
        if (flag) {
            char[] resault = normal.toCharArray();
            List<Character> location = new ArrayList<Character>();
            for (int i = 0; i < resault.length; i++) {
                if ((resault[i] >= 65) && (resault[i] <= 90)) {
                    location.add(resault[i]);
                }
            }
            for (int i = 0; i < location.size(); i++) {
                normal = normal.replace(String.valueOf(location.get(i)),"");
            }
//            normal = normal.toLowerCase();
        }
        System.out.println(normal);
    }
}
