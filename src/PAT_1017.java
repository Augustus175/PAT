
import java.math.BigInteger;
import java.util.Scanner;
/**
 * Created by thinkpad on 2016/12/27.
 */
public class PAT_1017 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BigInteger A =sc.nextBigInteger();

        BigInteger B = sc.nextBigInteger();
        BigInteger Q = A.divide(B);
        BigInteger R = A.mod(B);
//      ������ܻ��У�����˵������һ���Ǵ�ģ����һ�в��ǶԵ�
//        System.out.println(Q +" "+R);
        System.out.println(Q +" "+R);
    }
}
