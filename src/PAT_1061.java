import java.util.Scanner;

/**
 * Created by Gavin.Stevenson on 2017/2/10.
 */
public class PAT_1061 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//  The num of students;
        int stnunm = sc.nextInt();
//  The num of question
        int tenum = sc.nextInt();
//  The score of each question
        int[] rightsco = new int[tenum];
//  The answer of each question
        int[] anw = new int[tenum];
//  The students' answer
        int[][] result = new int[stnunm][tenum];

        int[] count = new int[stnunm];

        for (int i = 0; i < tenum; i++) {

            rightsco[i] = sc.nextInt();

        }

        for (int i = 0; i < tenum; i++) {

            anw[i] = sc.nextInt();

        }
        for (int i = 0; i < stnunm; i++) {

            for (int j = 0; j < tenum; j++) {

                result[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < stnunm; i++) {

            for (int j = 0; j < tenum; j++) {

                if (result[i][j] == anw[j]) {

                    count[i] = count[i] + rightsco[j];
                }
            }
        }

        for (int i = 0; i < stnunm; i++) {

            System.out.println(count[i]);
        }
    }
}
