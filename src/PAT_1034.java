import java.util.Scanner;

/**
 * Created by Gavin.Stevenson on 2017/1/12.
 */
public class PAT_1034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        System.out.println(str1);
        System.out.println(str2);
        int[] A =null;
        int[] B = null;

        int a1 = Integer.parseInt(str1.replaceAll("/", " ").split(" ")[0]);
        int b1 = Integer.parseInt(str1.replaceAll("/", " ").split(" ")[1]);
//        A = Fractional(a1, b1);
//        System.out.println(A[0] + " " + A[1] + "/" + A[2]);

        int a2 = Integer.parseInt(str2.replaceAll("/", " ").split(" ")[0]);
        int b2 = Integer.parseInt(str2.replaceAll("/", " ").split(" ")[1]);
//        B = Fractional(a2, b2);

//        System.out.println(B[0] + " " + B[1] + "/" + B[2]);

        int den = b1 * b2;

//        计算两数的和
        int numeratorSum = a1 * b2 + a2 * b1;
        int[] sumre = Fractional(numeratorSum, den);
        System.out.println(sumre[0] + " " + sumre[1] + "/" + sumre[2]);

//        计算两数的差
        int numeratorSub = a1 * b2 - a2 * b1;
        int[] subre = Fractional(numeratorSub, den);
        System.out.println(subre[0] + " " + subre[1] + "/" + subre[2]);

//        计算两数的积
        int multiplication = a1 * a2;
        int[] mulre = Fractional(multiplication, den);
        System.out.println(mulre[0] + " " + mulre[1] + "/" + mulre[2]);

//        计算两数的商
        int diviMem = a1 * b2;
        int diviNum = b1 * a2;
        int[] divre = Fractional(diviMem, diviNum);
        System.out.println(divre[0] + " " + divre[1] + "/" + divre[2]);

    }

    public static int mod(int a, int b) {
        if (a < b)
            return mod(b, a);

        while (a % b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return b;
    }

    public static int[] Fractional(int a, int b) {
        int[] resault = new int[3];
        resault[0] = a / b;
        int tmp = a - resault[0] * b;
        int m = mod(tmp, b);
        resault[1] = tmp / m;
        resault[2] = b / m;
        return resault;
    }

    public static String toString(int[] re) {
        StringBuffer sb = null;
        String str = sb.toString();
        return str;
    }

}
