
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
//      输出不能换行，就是说下面这一行是错的，最后一行才是对的
//        System.out.println(Q +" "+R);
        System.out.println(Q +" "+R);
    }
}
