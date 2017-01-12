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
        int a1 = Integer.parseInt( str1.replaceAll("/", " ").split(" ")[0]);
        int b1 = Integer.parseInt( str1.replaceAll("/", " ").split(" ")[1]);
        int a2 = Integer.parseInt( str2.replaceAll("/", " ").split(" ")[0]);
        int b2 = Integer.parseInt( str2.replaceAll("/", " ").split(" ")[1]);

//        String newStr1 = str1.replaceAll("/", " ");
//        String newStr2 = str2.replaceAll("/", " ");
//        System.out.println(newStr1);
//        System.out.println(newStr2 );
    }

}
