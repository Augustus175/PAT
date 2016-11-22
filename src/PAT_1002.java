import java.util.Scanner;

/**
 * Created by Gavin.Stevenson on 2016/11/15.
 * 1002. д������� (20)

 ʱ������
 400 ms
 �ڴ�����
 65536 kB
 ���볤������
 8000 B
 �������
 Standard
 ����
 CHEN, Yue
 ����һ����Ȼ��n���������λ����֮�ͣ��ú���ƴ��д���͵�ÿһλ���֡�

 �����ʽ��ÿ�������������1��������������������Ȼ��n��ֵ�����ﱣ֤nС��10100��

 �����ʽ����һ�������n�ĸ�λ����֮�͵�ÿһλ��ƴ�����ּ���1 �ո񣬵�һ�������һ��ƴ�����ֺ�û�пո�

 ����������
 1234567890987654321123456789
 ���������
 yi san wu

 */
public class PAT_1002 {
    public static void main(String[] args)
    {
        StringBuffer sb = new StringBuffer();
        boolean flag = true ;

        Scanner sc = new Scanner(System.in);
        String  str = sc.nextLine();
        int count = 0;
        for(int i = 0; i < str.length(); i++)
        {
           char c = str.charAt(i);
           int n = Integer.parseInt(String.valueOf(c));
            count = count + n;
        }

        while(flag )
        {
            String strtemp = NumPinyin(count %10);
            sb.insert(0, " "+strtemp);
            count = count / 10;
            if(count == 0 )
            {

                flag = false;
            }
        }
        String resault = sb.toString().trim();
        System.out.println(resault);

    }
    public static String NumPinyin(int n)
    {
        switch(n){

            case 0: return "ling";

            case 1: return "yi";

            case 2: return "er";

            case 3: return "san";

            case 4: return "si";

            case 5: return "wu";

            case 6: return "liu";

            case 7: return "qi";

            case 8: return "ba";

            case 9: return "jiu";

            default:return null;

        }

    }
}
