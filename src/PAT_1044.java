import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gavin.Stevenson on 2017/2/8.
 */
public class PAT_1044 {
    public static void main(String[] args) {
        String[] str = null;
        int num = 0;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            num = Integer.parseInt(br.readLine());
            str = new String[num];
            for (int i = 0; i < num; i++) {
                str[i] = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < num; i++) {
            try{
                int k = Integer.parseInt(str[i]);
                System.out.println(earthTomars(tranNum(k)));
            }
            catch(Exception e){
                System.out.println(marsToearth(str[i]));
            }
        }
    }

    public static int[] tranNum(int tmp) {
        List<Integer> result = new ArrayList<Integer>();
        do {
            result.add(tmp % 13);
            tmp = tmp / 13;
        } while (tmp != 0);
        int size = result.size();
        int[] re = new int[size];
        for (int i = 0; i <size; i++) {
            re[i] = result.get(i);
        }
        return re;
    }

    public static String earthTomars(int[] t) {
        StringBuffer sb = new StringBuffer();
        if (t.length > 1) {
            switch (t[0]) {
                case 0:
                    sb.append(" tret");
                    break;
                case 1:
                    sb.append(" jan");
                    break;
                case 2:
                    sb.append(" feb");
                    break;
                case 3:
                    sb.append(" mar");
                    break;
                case 4:
                    sb.append(" apr");
                    break;
                case 5:
                    sb.append(" may");
                    break;
                case 6:
                    sb.append(" jun");
                    break;
                case 7:
                    sb.append(" jly");
                    break;
                case 8:
                    sb.append(" aug");
                    break;
                case 9:
                    sb.append(" sep");
                    break;
                case 10:
                    sb.append(" oct");
                    break;
                case 11:
                    sb.append(" nov");
                    break;
                case 12:
                    sb.append(" dec");
                    break;
            }
            switch (t[1]) {

                case 1:
                    sb.insert(0, "tam");
                    break;
                case 2:
                    sb.insert(0, "hel");
                    break;
                case 3:
                    sb.insert(0, "maa");
                    break;
                case 4:
                    sb.insert(0, "huh");
                    break;
                case 5:
                    sb.insert(0, "tou");
                    break;
                case 6:
                    sb.insert(0, "kes");
                    break;
                case 7:
                    sb.insert(0, "hei");
                    break;
                case 8:
                    sb.insert(0, "elo");
                    break;
                case 9:
                    sb.insert(0, "syy");
                    break;
                case 10:
                    sb.insert(0, "lok");
                    break;
                case 11:
                    sb.insert(0, "mer");
                    break;
                case 12:
                    sb.insert(0, "jou");
                    break;
            }
        } else {
            switch (t[0]) {
                case 0:
                    sb.append("tret");
                    break;
                case 1:
                    sb.append("jan");
                    break;
                case 2:
                    sb.append("feb");
                    break;
                case 3:
                    sb.append("mar");
                    break;
                case 4:
                    sb.append("apr");
                    break;
                case 5:
                    sb.append("may");
                    break;
                case 6:
                    sb.append("jun");
                    break;
                case 7:
                    sb.append("jly");
                    break;
                case 8:
                    sb.append("aug");
                    break;
                case 9:
                    sb.append("sep");
                    break;
                case 10:
                    sb.append("oct");
                    break;
                case 11:
                    sb.append("nov");
                    break;
                case 12:
                    sb.append("dec");
                    break;
            }
        }
        return sb.toString();
    }

    public static int marsToearth(String str) {
        int re = -1;
        if (str.length() > 3) {
            String[] s = new String[2];
            s[0] = str.split(" ")[0];
            s[1] = str.split(" ")[1];
            switch (s[0]) {
                case "tam":
                    re = 1 * 13;
                    break;
                case "hel":
                    re = 2 * 13;
                    break;
                case "maa":
                    re = 3 * 13;
                    break;
                case "huh":
                    re = 4 * 13;
                    break;
                case "tou":
                    re = 5 * 13;
                    break;
                case "kes":
                    re = 6 * 13;
                    break;
                case "hei":
                    re = 7 * 13;
                    break;
                case "elo":
                    re = 8 * 13;
                    break;
                case "syy":
                    re = 9 * 13;
                    break;
                case "lok":
                    re = 10 * 13;
                    break;
                case "mer":
                    re = 11 * 13;
                    break;
                case "jou":
                    re = 12 * 13;
                    break;
            }
            re = re + unit(s[1]);
        } else {
            re = unit(str);
        }
        return re;
    }

    public static int unit(String str) {
        int re = -1;
        switch (str) {
            case "tret":
                re = 0;
                break;
            case "jan":
                re = 1;
                break;
            case "feb":
                re = 2;
                ;
                break;
            case "mar":
                re = 3;
                break;
            case "apr":
                re = 4;
                break;
            case "may":
                re = 5;
                break;
            case "jun":
                re = 6;
                break;
            case "jly":
                re = 7;
                break;
            case "aug":
                re = 8;
                break;
            case "sep":
                re = 9;
                break;
            case "oct":
                re = 10;
                break;
            case "nov":
                re = 11;
                break;
            case "dec":
                re = 12;
                break;
            case "tam":
                re = 13;
                break;
        }
        return re;
    }
}
