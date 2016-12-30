import java.util.Scanner;
/**
 * Created by thinkpad on 2016/12/30.
 */
public class PAT_1019 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);
    }
    public int[] getUnit(int num)
    {
        while(num!=0){
            System.out.println(num%10);
            num=num/10;
        }
    }
    public int greaterSort(int n)
    {

        return 0;
    }
    public int lessSort(int m)
    {
        return 0;
    }
}
