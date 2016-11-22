/**
 * Created by Gavin.Stevenson on 2016/11/16.
 * 1003. 我要通过！(20)


 * “答案正确”是自动判题系统给出的最令人欢喜的回复。本题属于PAT的“答案正确”大派送 —— 只要读入的字符串满足下列条件，系统就输出“答案正确”，否则输出“答案错误”。

 得到“答案正确”的条件是：

 1. 字符串中必须仅有P, A, T这三种字符，不可以包含其它字符；
 2. 任意形如 xPATx 的字符串都可以获得“答案正确”，其中 x 或者是空字符串，或者是仅由字母 A 组成的字符串；
 3. 如果 aPbTc 是正确的，那么 aPbATca 也是正确的，其中 a, b, c 均或者是空字符串，或者是仅由字母 A 组成的字符串。

 现在就请你为PAT写一个自动裁判程序，判定哪些字符串是可以获得“答案正确”的。
 输入格式： 每个测试输入包含1个测试用例。第1行给出一个自然数n (<10)，是需要检测的字符串个数。接下来每个字符串占一行，字符串长度不超过100，且不包含空格。

 输出格式：每个字符串的检测结果占一行，如果该字符串可以获得“答案正确”，则输出YES，否则输出NO。

 输入样例：
 8
 PAT
 PAAT
 AAPATAA
 AAPAATAAAA
 xPATx
 PT
 Whatever
 APAAATAA
 输出样例：
 YES
 YES
 YES
 YES
 NO
 NO
 NO
 NO
 *
 *这个题目会存在一些小小的问题，主要是对于题目的理解不是很到位引起的。

 首先我们看题目的意思，1和2两点没有问题，主要是第3点，其实第3点是对第2点的推广。理解了这一点之后，就可以发现规律了。其实从2我们可以发现，在1 2的约束下，满足条件的只有两种形式PAT和APATA，那么3中满足条件的必然是从2推导出来的。

 1.如果初始的是PAT那么接下来就是PAAT，再接下来就是PAAAT，以此类推。条件2说明字符串必须是对称的以“PAT”为对称中心，因此条件3就可以理解了

 2.如果初始状态是aPATa的话，那么接下来就是aPAATaa，在接下来就是aPAAATaaa,其中a为A的字符串，我们发现num(P前面a)*num(A)=num(T后面a)，上面的形式也满足这个条件，所以我们可以利用这个约束来判断。
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
//    这个判断语句就是为了实现num(P前面a)*num(A)=num(T后面a)
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
