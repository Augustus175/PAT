import java.util.Scanner;

/**
 * Created by Gavin.Stevenson on 2017/1/12.
 */
public class PAT_1034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        int[] A = null;
        int[] B = null;

        int a1 = Integer.parseInt(str1.replaceAll("/", " ").split(" ")[0]);
        int b1 = Integer.parseInt(str1.replaceAll("/", " ").split(" ")[1]);
        A = Fractional(a1, b1);
//        System.out.println(A[0] + " " + A[1] + "/" + A[2]);;
        String outresA = toString(A);
//        System.out.println("the first number is ;" + toString(A));
        int a2 = Integer.parseInt(str2.replaceAll("/", " ").split(" ")[0]);
        int b2 = Integer.parseInt(str2.replaceAll("/", " ").split(" ")[1]);
        B = Fractional(a2, b2);
//        System.out.println(B[0] + " " + B[1] + "/" + B[2]);
        String outresB = toString(B);

//        System.out.println("the second number is ;" + toString(B));
        int den = b1 * b2;

//        计算两数的和
        int numeratorSum = a1 * b2 + a2 * b1;
        int[] sumre = Fractional(numeratorSum, den);
//        System.out.println(sumre[0] + " " + sumre[1] + "/" + sumre[2]);
        System.out.println(outresA + " " + "+" + " " + outresB + " " + "=" + " " + toString(sumre));
//        计算两数的差
        int numeratorSub = a1 * b2 - a2 * b1;
        int[] subre = Fractional(numeratorSub, den);
//        System.out.println(subre[0] + " " + subre[1] + "/" + subre[2]);
        System.out.println(outresA + " " + "-" + " " + outresB + " " + "=" + " " + toString(subre));

//        计算两数的积
        int multiplication = a1 * a2;
        int[] mulre = Fractional(multiplication, den);
//        System.out.println(mulre[0] + " " + mulre[1] + "/" + mulre[2]);
        System.out.println(outresA + " " + "*" + " " + outresB + " " + "=" + " " + toString(mulre));

//        计算两数的商
        int diviMem = a1 * b2;
        int diviNum = b1 * a2;
        if (diviNum == 0) {
            System.out.println(outresA + " " + "/" + " " + outresB + " " + "=" + " " + "Inf");

//            System.out.println("Inf");
        } else {
            int[] divre = Fractional(diviMem, diviNum);
//            System.out.println(divre[0] + " " + divre[1] + "/" + divre[2]);
            System.out.println(outresA + " " + "/" + " " + outresB + " " + "=" + " " + toString(divre));

        }


    }


    public static int mod(int a, int b) {
        if (a % b == 0) {
            return b;
        } else {
            while (b != 0) {
                int temp = a % b;
                a = b;
                b = temp;
            }
            return a;
        }
    }

    public static int[] Fractional(int a, int b) {
        int[] resault = new int[3];
//        计算整数部分
        resault[0] = a / b;
//        计算分数部分
//        如果tmp==0那么说明这不是一个分数，就是一个整数
        int tmp = a - resault[0] * b;
        if (tmp == 0) {
            resault[1] = 0;
            resault[2] = 0;
        } else {
//        计算最大公约数，以便进行约分
            int m = mod(tmp, b);
            resault[1] = tmp / m;
            resault[2] = b / m;
        }
        return resault;
    }

    //格式化输出函数，形参是长度为3的整形数组，其中re[0]、re[1]、re[2]放的是分数的整数部分、分子及分母
    public static String toString(int[] re) {
        StringBuffer sb = new StringBuffer();
        boolean flag = false;
        if (re[0] < 0 || re[1] < 0 || re[2] < 0) {
            re[0] = Math.abs(re[0]);
            re[1] = Math.abs(re[1]);
            re[2] = Math.abs(re[2]);
            flag = true;
        }
        if (re[0] == 0 && re[1] == 0) {
            sb.append(0);
        } else {
            if (re[0] == 0 && re[1] != 0) {
                if (flag) {
                    sb.append("(-");
                    sb.append(re[1]);
                    sb.append("/");
                    sb.append(re[2]);
                    sb.append(")");
                } else {
                    sb.append(re[1]);
                    sb.append("/");
                    sb.append(re[2]);
                }
            } else if (re[0] != 0 && re[1] == 0) {

                if (flag) {
                    sb.append("(-");
                    sb.append(re[0]);
                    sb.append(")");
                } else {
                    sb.append(re[0]);
                }
            } else {
                if (flag) {
                    sb.append("(-");
                    sb.append(re[0]);
                    sb.append(" ");
                    sb.append(re[1]);
                    sb.append("/");
                    sb.append(re[2]);
                    sb.append(")");
                } else {
                    sb.append(re[0]);
                    sb.append(" ");
                    sb.append(re[1]);
                    sb.append("/");
                    sb.append(re[2]);
                }
            }
        }
        String str = sb.toString();
        return str;
    }

}
