import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created by thinkpad on 2017/1/2.
 */
public class PAT_1024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String
        BigDecimal bd = sc.nextBigDecimal();
        System.out.print(bd.toPlainString());
    }
}
