import java.util.Scanner;

/**
 * Created by Gavin.Stevenson on 2016/11/25.
 */
public class PAT_1009 {
    public static void main(String[] args) {
        String line = null;
        Scanner sc = new Scanner(System.in);
        line = sc.nextLine();
        String[] words = line.split(" ");
        int len = words.length;

        words = arrShift(words);

        for (int i = 0; i < words.length - 1; i++) {
            System.out.print(words[i] + " ");
        }
        System.out.println(words[words.length - 1]);
    }

    public static String[] arrShift(String[] arr) {
       String tmp = null;
        if(arr.length % 2 == 0)
       {
           for (int i = 0; i < (arr.length / 2); i++) {
               tmp = arr[i];
               arr[i] = arr[arr.length - 1 -i];
               arr[arr.length -1-i] = tmp;
           }
       }
       else
       {
           for (int i = 0; i < ((arr.length - 1)/2); i++) {
               tmp = arr[i];
               arr[i] = arr[arr.length - 1 -i];
               arr[arr.length -1-i] = tmp;
           }
       }
        return arr;
    }
}
