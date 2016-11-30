/**
 * Created by Gavin.Stevenson on 2016/11/29.
 */
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class PAT_1012 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] numstr = line.split("\\s+");
//        for (int i = 0; i < numstr.length; i++) {
//            System.out.println(numstr[i]);
//        }
        int[] num = new int[numstr.length];
        int even = 0;
        int numA2 = 0;
        int A2count = 0;
        int A3count = 0;
        int numA4 = 0;
        int A4count = 0;
        int numA5 = 0;
        for (int i = 0; i < numstr.length; i++) {
            num[i] = Integer.parseInt(numstr[i]);
            int tmp = num[i] % 5;
            switch(tmp)
            {
                case 0:
                {
                    if(num[i] % 2 == 0)
                    {
                        even = even + num[i];
                    }
                    break;
                }
                case 1:
                        {
                            if (A2count % 2 == 0) {
                                numA2 = num[i] + numA2;
                            }else
                            {
                                numA2 = numA2 + (-1) * num[i];
                            }
                            A2count++;
                            break;
                        }
                case 2:
                        {
                            A3count++;
                            break;
                        }
                case 3: {
                    A4count++;
                    numA4 = numA4 + num[i];
                    break;
                }
                case 4:{
                    if (numA5 < num[i])
                    {
                        numA5 = num[i];
                    }
                    break;
                }
            }

        }
        DecimalFormat df = new DecimalFormat("0.0");
        String ave = null;
        if(A4count == 0)
        {
            ave = "N";
        }
        else {
            double res = (double) numA4 / A4count;
            ave = df.format(res);
        }
        if(even == 0)
        {
            System.out.print("N" + " ");
        }
        else{
            System.out.print(even+ " ");
        }
        if (numA2 == 0)
        {
            System.out.print("N" + " ");
        }else
        {
            System.out.print(numA2+ " ");
        }
        if (A3count == 0)
        {
            System.out.print("N" + " ");
        }else
        {
            System.out.print(A3count+ " ");
        }
        System.out.print(ave+ " ");
        if (numA5 == 0)
        {
            System.out.print("N");
        }else
        {
            System.out.print(numA5);
        }

    }
}
