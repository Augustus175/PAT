import java.util.Scanner;

/**
 * Created by Gavin.Stevenson on 2017/2/9.
 */
public class PAT_1048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Astr = sc.next();
        String Bstr = sc.next();
        int[] B = new int[Bstr.length()];
        int[] A = new int[Bstr.length()];
        for (int i = Bstr.length()-1; i>=0; i--) {
            B[i] = (int)Bstr.charAt(i)-48;
            if (i<Astr.length())
            {
                A[i] =(int)Astr.charAt(i)-48;
            }else{
                A[i]=0;
            }
        }
        for (int i = 0; i < Bstr.length(); i++) {
            System.out.print(A[i]);
        }

        System.out.println();

        for (int i = 0; i < Bstr.length(); i++) {
            System.out.print(B[i]);
        }
    }
}
