import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Gavin.Stevenson on 2016/11/15.
 * PAT �Ҽ�1001
 * ������(PAT_1001)���룺

 ���κ�һ����Ȼ��n���������ż������ô��������һ�룻���������������ô��(3n+1)����һ�롣����һֱ��������ȥ�����һ����ĳһ���õ�n=1����������1950���������ѧ�Ҵ���Ϲ�����������룬��˵��ʱҮ³��ѧʦ���붯Ա��ƴ����֤�����ò�ƺ�ɵ����������⣬����ֵ�ѧ��������ѧҵ��һ��ֻ֤(3n+1)������������˵����һ����ı�����������������ӻ�������ѧ���ѧ����еĽ�չ����

 ���ǽ������Ŀ����֤�������Ȳ��룬���ǶԸ�������һ������1000��������n���򵥵���һ�£���Ҫ���ٲ��������£����ܵõ�n=1��

 �����ʽ��ÿ�������������1��������������������Ȼ��n��ֵ��

 �����ʽ�������n���㵽1��Ҫ�Ĳ�����

 ����������
 3
 ���������
 5
 */
 public class PAT_1001 {
    static int count = 0;
    public static void main(String[] args)
        {
            String s = null;
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                s = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();}
            int n =Integer.parseInt(s);
            if(n <= 1000 || n > 0) {
                callatz(n);
            }
        System.out.println(count);
    }
    public static void callatz(int n) {
        if (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
                n = n / 2;
            }
            System.out.println(n);
            count++;
            callatz(n);
        }

    }
}
