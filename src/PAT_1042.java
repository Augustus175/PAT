import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Gavin.Stevenson on 2017/2/8.
 */
public class PAT_1042 {
    public static void main(String[] args) {
        String str = null;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            str = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        str = str.toLowerCase();
        char[] stor = str.toCharArray();
        int[] re = findchar(stor);
        char c = (char)(re[0]+97);
        System.out.println(c+ " "+re[1]);
    }

    public static int[] findchar(char[] c) {
        int[] re = new int[2];
        int foot = -1;
        int max = -1;
        int[] resault = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,};
        for (int i = 0; i < c.length; i++) {
            switch (c[i]) {
                case 97:
                    resault[0]++;
                    break;
                case 98:
                    resault[1]++;
                    break;
                case 99:
                    resault[2]++;
                    break;
                case 100:
                    resault[3]++;
                    break;
                case 101:
                    resault[4]++;
                    break;
                case 102:
                    resault[5]++;
                    break;
                case 103:
                    resault[6]++;
                    break;
                case 104:
                    resault[7]++;
                    break;
                case 105:
                    resault[8]++;
                    break;
                case 106:
                    resault[9]++;
                    break;
                case 107:
                    resault[10]++;
                    break;
                case 108:
                    resault[11]++;
                    break;
                case 109:
                    resault[12]++;
                    break;
                case 110:
                    resault[13]++;
                    break;
                case 111:
                    resault[14]++;
                    break;
                case 112:
                    resault[15]++;
                    break;
                case 113:
                    resault[16]++;
                    break;
                case 114:
                    resault[17]++;
                    break;
                case 115:
                    resault[18]++;
                    break;
                case 116:
                    resault[19]++;
                    break;
                case 117:
                    resault[20]++;
                    break;
                case 118:
                    resault[21]++;
                    break;
                case 119:
                    resault[22]++;
                    break;
                case 120:
                    resault[23]++;
                    break;
                case 121:
                    resault[24]++;
                    break;
                case 122:
                    resault[25]++;
                    break;
            }

        }
        for (int i = 0; i < resault.length; i++) {
           if (max<resault[i])
           {
               max = resault[i];
               foot = i;
           }
        }
        re[0]=foot;
        re[1]=max;
        return re;
    }


}
