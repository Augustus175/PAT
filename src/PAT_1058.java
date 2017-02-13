import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gavin.Stevenson on 2017/2/11.
 */
public class PAT_1058 {

    public static void main(String[] args) {

        List<String> lines = new ArrayList<String>();
        int stunum = 0;
        int quenum = 0;
        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String l = null;

            l = br.readLine();
//      the number of students
            stunum = Integer.parseInt(l.split(" ")[0]);
//      the number of questions
            quenum = Integer.parseInt(l.split(" ")[1]);
            for (int i = 0; i < stunum + quenum; i++) {
                l = br.readLine();
                lines.add(l);
            }


        } catch (IOException e) {

            e.printStackTrace();

        }

//      the score of each question
        int[] score = new int[quenum];
//      the all number of choice
        int[] acnum = new int[quenum];
//      the right number of choice
        int[] rcnum = new int[quenum];
//      the  right choice of each question
        String[] rchoise = new String[quenum];
        for (int i = 0; i < quenum; i++) {

            score[i] = Integer.parseInt(lines.get(i).split(" ")[0]);

            acnum[i] = Integer.parseInt(lines.get(i).split(" ")[1]);

            rcnum[i] = Integer.parseInt(lines.get(i).split(" ")[2]);

//            rchoise[i] = new String[rcnum[i]];

            for (int j = 0; j <= rcnum[i]; j++) {
                String s = lines.get(i).split(" ")[j + 2];
                if (rchoise[i] == (null)) {
                    rchoise[i] = s;
                } else {
                    rchoise[i] += s;
                }
//                rchoise[i] += lines.get(i).split(" ")[j + 2];

//                rchoise[i] += lines.get(i).split(" ")[j + 2];

            }
        }
        String[][] stucho = new String[stunum][quenum];

        for (int i = 0; i < stunum; i++) {

            for (int j = 0; j < quenum; j++) {

                String str = lines.get(i + 4).split("\\)")[j].replaceAll("\\(", "").replaceAll(" ", "");

                stucho[i][j] = str;
            }
        }

        int[] stuscore = new int[stunum];

        int[] wrongque = new int[quenum];

        for (int i = 0; i < stunum; i++) {

            for (int j = 0; j < quenum; j++) {

                if (stucho[i][j].equals(rchoise[j])) {
                    stuscore[i] += score[i];

                }else{
                    wrongque[j]++;
                }
            }
        }
        for (int i = 0; i < stunum; i++) {
            System.out.println(stuscore[i]);
        }
        List<Integer> wrongnum = new ArrayList<Integer>();
        int max = 0;
        for (int i = 0; i < quenum; i++) {
            if(max<=wrongque[i])
            {
                if(max==wrongque[i])
                {
                    wrongnum.add(i+1);
                }else{
                    wrongnum.clear();
                    max = wrongque[i];
                    wrongnum.add(i+1);
                }
            }
        }
        if(wrongnum.size()!=0) {
                System.out.print(max + " ");
            for (int i = 0; i < wrongnum.size() - 1; i++) {
                System.out.print(wrongnum.get(i) + " ");
            }
            System.out.println(wrongnum.get(wrongnum.size() - 1));
        }else{
            System.out.println("Too simple");
        }

    }
}
//        System.out.println("======================================================================================");
//
//        for (int i = 0; i < lines.size(); i++) {
//
//            System.out.println(lines.get(i));
//        }
//        for (int i = 0; i < quenum; i++) {
//            System.out.print(score[i] + " ");
//            System.out.print(rcnum[i] + " ");
//            System.out.print(rchoise[i] + " ");
//        }
//        System.out.println();
//        System.out.println("--------------------------------------------------------------------------------------");
//        for (int i = 0; i < stunum; i++) {
//
//            for (int j = 0; j < quenum; j++) {
//
//                System.out.print(stucho[i][j]+" ");
//            }
//            System.out.println();
//        }