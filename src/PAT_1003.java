/**
 * Created by Gavin.Stevenson on 2016/11/16.
 * 1003. ��Ҫͨ����(20)


 * ������ȷ�����Զ�����ϵͳ�����������˻�ϲ�Ļظ�����������PAT�ġ�����ȷ�������� ���� ֻҪ������ַ�����������������ϵͳ�����������ȷ��������������𰸴��󡱡�

 �õ�������ȷ���������ǣ�

 1. �ַ����б������P, A, T�������ַ��������԰��������ַ���
 2. �������� xPATx ���ַ��������Ի�á�����ȷ�������� x �����ǿ��ַ����������ǽ�����ĸ A ��ɵ��ַ�����
 3. ��� aPbTc ����ȷ�ģ���ô aPbATca Ҳ����ȷ�ģ����� a, b, c �������ǿ��ַ����������ǽ�����ĸ A ��ɵ��ַ�����

 ���ھ�����ΪPATдһ���Զ����г����ж���Щ�ַ����ǿ��Ի�á�����ȷ���ġ�
 �����ʽ�� ÿ�������������1��������������1�и���һ����Ȼ��n (<10)������Ҫ�����ַ���������������ÿ���ַ���ռһ�У��ַ������Ȳ�����100���Ҳ������ո�

 �����ʽ��ÿ���ַ����ļ����ռһ�У�������ַ������Ի�á�����ȷ���������YES���������NO��

 ����������
 8
 PAT
 PAAT
 AAPATAA
 AAPAATAAAA
 xPATx
 PT
 Whatever
 APAAATAA
 ���������
 YES
 YES
 YES
 YES
 NO
 NO
 NO
 NO
 *
 *�����Ŀ�����һЩСС�����⣬��Ҫ�Ƕ�����Ŀ����ⲻ�Ǻܵ�λ����ġ�

 �������ǿ���Ŀ����˼��1��2����û�����⣬��Ҫ�ǵ�3�㣬��ʵ��3���ǶԵ�2����ƹ㡣�������һ��֮�󣬾Ϳ��Է��ֹ����ˡ���ʵ��2���ǿ��Է��֣���1 2��Լ���£�����������ֻ��������ʽPAT��APATA����ô3�����������ı�Ȼ�Ǵ�2�Ƶ������ġ�

 1.�����ʼ����PAT��ô����������PAAT���ٽ���������PAAAT���Դ����ơ�����2˵���ַ��������ǶԳƵ��ԡ�PAT��Ϊ�Գ����ģ��������3�Ϳ��������

 2.�����ʼ״̬��aPATa�Ļ�����ô����������aPAATaa���ڽ���������aPAAATaaa,����aΪA���ַ��������Ƿ���num(Pǰ��a)*num(A)=num(T����a)���������ʽҲ��������������������ǿ����������Լ�����жϡ�
 */
import java.util.Scanner;
public class PAT_1003 {
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  int num = sc.nextInt();
  for(int i=0; i<num; i++){
   int numa = 0;
   int nump = 0;
   int numt = 0;
   boolean flag = false;
   String str = sc.next();
   for(int j=0; j<str.length(); j++){
    char ch = str.charAt(j);

    if(ch == 'A')
     numa++;
    else if(ch == 'P')
     nump++;
    else if(ch == 'T')
     numt++;
    else{
     flag = false;
     break;
    }
   }
   if(numa>=1 && nump==1 && numt==1){
//    ����ж�������Ϊ��ʵ��num(Pǰ��a)*num(A)=num(T����a)
    if(str.indexOf('P')*(str.indexOf('T')-str.indexOf('P')-1) == str.length() - str.indexOf('T') -1)
     flag = true;
    else
     flag = false;
   }
   if(flag)
    System.out.println("YES");
   else
    System.out.println("NO");
  }

 }
}
