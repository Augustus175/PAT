/**
 * Created by thinkpad on 2016/11/23.
 */
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class PAT_1014 {
    public static void main(String[] args)
    {
        StringBuffer sb = new StringBuffer();
        Scanner sc = new Scanner(System.in);
        String[] lines = new String[4];
        for (int i = 0; i < 4; i++) {
            lines[i] = sc.nextLine();
        }
       sb = findChar0(lines[0],lines[1]);
        int min = findChar1(lines[2],lines[3]);
        if(min < 10)
        {
            sb.append(0);
            sb.append(min);
        }
        else
        {
            sb.append(min);
        }
        System.out.println(sb.toString());
    }
    public static StringBuffer findChar0(String str0,String str1)
    {
        int size = 0;
        StringBuffer sb = new StringBuffer();
        int count = 0;
        if(str0.length() > str1.length())
        {
            size = str1.length();
        }
        else
        {
            size = str0.length();
        }
        for (int i = 0; i < size; i++) {
            char c0 = str0.charAt(i);
            char c1 = str1.charAt(i);

            if((c0 == c1)&&(((c0 >= 65)&&(c0 <= 90))||((c0 >= 97)&&(c0 <= 122))))
//            if((c0 == c1)&&((c0 >= 65)&&(c0 <= 90)))
            {
                if(count ==0)
                {
                    if(((c0 >= 65)&&(c0 <= 90))) {
                        sb.append(switchWeek(c0));
                        count++;
                    }
                }
                else
                {
                    sb.append(" ");
                    sb.append(switchHour(c0));
                    sb.append(":");
                    break;
                }

            }
        }
        return sb;
    }
    public static int findChar1(String str0,String str1)
    {

        int size = 0;
        int n = 0;
        if(str0.length() > str1.length())
        {
            size = str1.length();
        }
        else
        {
            size = str0.length();
        }
        for (int i = 0; i < size; i++) {
            char c0 = str0.charAt(i);
            char c1 = str1.charAt(i);
            if((c0 == c1)&&(((c0 >= 65)&&(c0 <= 90))||((c0 >= 97)&&(c0 <= 122))))
            {
                n = i;
                break;
            }
        }
        return n;
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
