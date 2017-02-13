import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gavin.Stevenson on 2017/2/12.
 */
public class PAT_1052 {
    public static void main(String[] args) {

        List<String> hands = new ArrayList<String>();

        List<String> eyes = new ArrayList<String>();

        List<String> mouthes = new ArrayList<String>();

        List<String> lines = new ArrayList<String>();

        int num = 0;

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            for (int i = 0; i < 3; i++) {
                String l = br.readLine().replaceAll(" ", "");
                lines.add(l);
            }
            num = Integer.parseInt(br.readLine());
            for (int i = 0; i < num; i++) {
                String l = br.readLine();
                lines.add(l);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        int l0 = lines.get(0).length() - lines.get(0).replaceAll("\\[", "").length();
        int l1 = lines.get(1).length() - lines.get(1).replaceAll("\\[", "").length();
        int l2 = lines.get(2).length() - lines.get(2).replaceAll("\\[", "").length();
        for (int i = 0; i < l0; i++) {
            String s = lines.get(0).split("]")[i];
            hands.add(s.replace("[", ""));
        }
        for (int i = 0; i < l1; i++) {
            String s = lines.get(1).split("]")[i];
            eyes.add(s.replace("[", ""));
        }
        for (int i = 0; i < l2; i++) {
            String s = lines.get(2).split("]")[i];
            mouthes.add(s.replace("[", ""));
        }
        int[][] request = new int[num][5];
        boolean[] flag = new boolean[num];
        int h = hands.size();
        int e = eyes.size();
        int m = mouthes.size();
        for (int i = 0; i < num; i++) {

            boolean flag0 = false;
            boolean flag1 = false;
            boolean flag2 = false;
            boolean flag3 = false;
            boolean flag4 = false;
            int tmp0 = Integer.parseInt(lines.get(i + 3).split(" ")[0]) - 1;
            if (tmp0 < h) {
                flag0 = true;
            }
            int tmp1 = Integer.parseInt(lines.get(i + 3).split(" ")[1]) - 1;

            if (tmp1 < e) {
                flag1 = true;
            }
            int tmp2 = Integer.parseInt(lines.get(i + 3).split(" ")[2]) - 1;

            if (tmp2 < m) {
                flag2 = true;
            }
            int tmp3 = Integer.parseInt(lines.get(i + 3).split(" ")[3]) - 1;

            if (tmp3 < e) {
                flag3 = true;
            }
            int tmp4 = Integer.parseInt(lines.get(i + 3).split(" ")[4]) - 1;

            if (tmp4 < h) {
                flag4 = true;
            }
            if (flag0 && flag1 && flag2 && flag3 && flag4) {
                flag[i] = true;
            }
            request[i][0] = tmp0;
            request[i][1] = tmp1;
            request[i][2] = tmp2;
            request[i][3] = tmp3;
            request[i][4] = tmp4;
        }
        for (int i = 0; i < num; i++) {
            if (flag[i])
            {

                System.out.println(hands.get(request[i][0])+"("+eyes.get(request[i][1])+mouthes.get(request[i][2])+eyes.get(request[i][3])+")"+hands.get(request[i][4]));
            }else{
                System.out.println("Are you kidding me? @\\/@");
            }
        }
    }
}
