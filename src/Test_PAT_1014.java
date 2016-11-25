/**
 * Created by thinkpad on 2016/11/23.
 */
import java.util.Scanner;

public class Test_PAT_1014 {
    public static void main(String[] args)
    {
        int min1 = 0;
        int min2 = 0;
        int max = 0;
        int count = 0;
        int time = 0;
        char[] result = new char[2];
        int minut = 0;
        StringBuffer sb = new StringBuffer();
        Scanner sc = new Scanner(System.in);
        String line = null;
        int[] l = new int[4];
        line = sc.nextLine();
        l[0] = line.length();
        char[] c0 = new char[l[0]];
        for (int i = 0; i < l[0]; i++) {
            c0[i] = line.charAt(i);
//            System.out.println(c0[i]);
        }
        line = sc.nextLine();
        l[1] = line.length();
        char[] c1 = new char[l[1]];
        for (int i = 0; i < l[1]; i++) {
            c1[i] = line.charAt(i);
//            System.out.println(c1[i]);
        }
        line = sc.nextLine();
        l[2] = line.length();
        char[] c2 = new char[l[2]];
        for (int i = 0; i < l[2]; i++) {
            c2[i] = line.charAt(i);
//            System.out.println(c2[i]);
        }
        line = sc.nextLine();
        l[3] = line.length();
        char[] c3 = new char[l[3]];
        for (int i = 0; i < l[3]; i++) {
            c3[i] = line.charAt(i);
//            System.out.println(c3[i]);
        }


        if(l[0] >l[1])
        {
            min1 = l[1];
        }else
        {
            min1 = l[0];
        }
        if(l[2] >l[3])
        {
            min2 = l[3];
        }else
        {
            min2 = l[2];
        }
        if(min1 < min2)
        {
            max = min2;
        }else
        {
            max = min1;
        }

        for (int i = 0; i <max ; i++) {
            if(i< min1 )
            {
                if((c0[i] == c1[i]))
                {
                    if((c0[i] >= 65)&&(c0[i] <= 90))
                    {
                        if(count == 0)
                        {
                            result[0] = c0[i];
                            count++;
                            time++;
                        }
                        else
                        {
                            result[1] = c0[i];
                            time++;
                        }

                    }
                }
            }
            if(i < min2)
            {
                if((c2[i] == c3[i])&&(((c0[i] >= 65)&&(c0[i] <= 90))||((c0[i] >= 97)&&(c0[i] <= 122))))
                {
                    minut = i;
                    time++;
                }
            }
            if(time == 3)
            {
                break;
            }
        }

        sb.append(switchWeek(result[0]));
        sb.append(" ");
        sb.append(switchHour(result[1]));
        sb.append(":");
        if(minut < 10)
        {
            sb.append("0");
            sb.append(minut);
        }
        else
        {
            sb.append(minut);
        }
        System.out.println(sb.toString());

    }

    public static String switchWeek(char c)
    {
        switch (c)
        {
            case 65:
                return "MON";
            case 66:
                return "TUE";
            case 67:
                return "WED";
            case 68:
                return "THU";
            case 69:
                return "FRI";
            case 70:
                return "SAT";
            case 71:
                return "SUN";
            default:
                return  " ";
        }
    }
    public static int switchHour(char c)
    {
        int t = 0;
        if((c>=48)&&(c<=57))
        {
            t = c - 48;
        }
        else
        {
            t = c- 55;
        }
        return t;
    }

}
