import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by Gavin.Stevenson on 2017/2/10.
 */
public class PAT_1057 {

    public static void main(String[] args) {

        String str = null;

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            str = br.readLine();

        } catch (IOException e) {

            e.printStackTrace();

        }
        str = str.toLowerCase();

        int l = str.length();

        int count = 0;

        for (int i = 0; i < l; i++) {

            char c = str.charAt(i);

            if (c >= 97 && c <= 122) {

                count = count + c - 96;
            }
        }
        String bin = Integer.toBinaryString(count);

        int bl = bin.length();

        int c0 = 0;

        int c1 = 0;
        if (count != 0) {

            for (int i = 0; i < bl; i++) {

                if (bin.charAt(i) == 48) {
                    c0++;
                } else {
                    c1++;
                }
            }

        }

        System.out.println(c0 + " " + c1);
    }
}
