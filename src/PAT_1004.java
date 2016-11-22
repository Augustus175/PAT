/**
 * Created by Gavin.Stevenson on 2016/11/21.
 */
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
public class PAT_1004 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Map<Integer, String> index = new HashMap<Integer,String>();
        int num = sc.nextInt();
        sc.nextLine();
        int[] score = new int[num];
        for(int i = 0;i < num; i++)
        {
            String line = sc.nextLine();
            String tmp[] = line.split(" ");
            String name = tmp[0]+ " " +tmp[1];
            score[i] = Integer.parseInt(tmp[2]);
            {
                index.put(score[i],name);
            }

        }
        Arrays.sort(score);

        System.out.println(index.get(score[score.length - 1]));
        System.out.println(index.get(score[0]));
    }
}
