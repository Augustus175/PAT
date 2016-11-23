/**
 * Created by thinkpad on 2016/11/23.
 */
import java.util.Scanner;

public class Test {
    public static void main(String[] args)
    {
        StringBuffer sb = new StringBuffer();
        Scanner sc = new Scanner(System.in);
        String line = null;
        int l0 = 0;
        int l1 = 0;
        int l2 = 0;
        int l3 = 0;
        line = sc.nextLine();
        l0 = line.length();
        char[] c0 = new char[l0];
        for (int i = 0; i < l0; i++) {
            c0[i] = line.charAt(i);
//            System.out.println(c0[i]);
        }
        line = sc.nextLine();
        l1 = line.length();
        char[] c1 = new char[l1];
        for (int i = 0; i < l1; i++) {
            c1[i] = line.charAt(i);
//            System.out.println(c1[i]);
        }
        line = sc.nextLine();
        l2 = line.length();
        char[] c2 = new char[l2];
        for (int i = 0; i < l2; i++) {
            c2[i] = line.charAt(i);
//            System.out.println(c2[i]);
        }
        line = sc.nextLine();
        l3 = line.length();
        char[] c3 = new char[l3];
        for (int i = 0; i < l3; i++) {
            c3[i] = line.charAt(i);
//            System.out.println(c3[i]);
        }
        int min1 = 0;
        int min2 = 0;
        int max = 0;

        if(l0 >l1)
        {
            min1 = l1;
        }else
        {
            min1 = l0;
        }
        if(l2 >l3)
        {
            min1 = l3;
        }else
        {
            min1 = l2;
        }
        if(min1 < min2)
        {
            max = min2;
        }else
        {
            max = min1;
        }
        for (int i = 0; i <max ; i++) {
            if((c0[i] == c1[i])&&(((c0[i] >= 65)&&(c0[i] <= 90))||((c0[i] >= 97)&&(c0[i] <= 122))))
            {

            }
            if((c2[i] == c3[i])&&(((c0[i] >= 65)&&(c0[i] <= 90))||((c0[i] >= 97)&&(c0[i] <= 122))))
        }


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
