/**
 * Created by thinkpad on 2016/12/3.
 */

import java.util.*;

public class PAT_1015 {
    public static Map<Integer, Integer> moral = new HashMap<Integer, Integer>();
    public static Map<Integer, Integer> talent = new HashMap<Integer, Integer>();
    public static Map<Integer, Integer> total = new HashMap<Integer, Integer>();
    public static Map<Integer, Integer> index = new HashMap<Integer, Integer>();
    public static List<Integer> First = new ArrayList<Integer>();
    public static List<Integer> Second = new ArrayList<Integer>();
    public static List<Integer> Third = new ArrayList<Integer>();
    public static List<Integer> Fourth = new ArrayList<Integer>();
    public static int Low = 0;
    public static int High = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int Num = sc.nextInt();
        Low = sc.nextInt();
        High = sc.nextInt();


        for (int i = 0; i < Num; i++) {
            int id = sc.nextInt();
            int m = sc.nextInt();
            int ta = sc.nextInt();
            int to = m + ta;
            if (m > Low && ta >= Low) {
                if (m >= High && ta >= High) {
                    First.add(id);
                } else if (m >= High && ta <= High) {
                    Second.add(id);
                } else if (m <= High && ta <= High && m > ta) {
                    Third.add(id);
                } else {
                    Fourth.add(id);
                }
            }

            moral.put(id, m);
            talent.put(id, ta);
            total.put(id, to);
            index.put(id, id);

        }
        Integer[] firstID = new Integer[First.size()];
        First.toArray(firstID);
        Integer[] secondID = new Integer[Second.size()];
        Second.toArray(secondID);
        Integer[] thirdID = new Integer[Third.size()];
        Third.toArray(thirdID);
        Integer[] fourthID = new Integer[Fourth.size()];
        Fourth.toArray(fourthID);
        for (int i = 0; i < firstID.length - 1; i++) {
            for (int j = i + 1; j < firstID.length; j++) {
                if (compare(firstID[i], firstID[j]) == 0) {
                    int k = 0;
                    k = firstID[i];
                    firstID[i] = firstID[j];
                    firstID[j] = k;
                }
            }
        }

        for (int i = 0; i < secondID.length - 1; i++) {
            for (int j = i + 1; j < secondID.length; j++) {
                if (compare(secondID[i], secondID[j]) == 0) {
                    int k = 0;
                    k = secondID[i];
                    secondID[i] = secondID[j];
                    secondID[j] = k;
                }
            }

        }

        for (int i = 0; i < thirdID.length - 1; i++) {
            for (int j = i + 1; j < thirdID.length; j++) {
                if (compare(thirdID[i], thirdID[j]) == 0) {
                    int k = 0;
                    k = thirdID[i];
                    thirdID[i] = thirdID[j];
                    thirdID[j] = k;
                }
            }
        }
        for (int i = 0; i < fourthID.length - 1; i++) {
            for (int j = i + 1; j < fourthID.length; j++) {
                if (compare(fourthID[i], fourthID[j]) == 0) {
                    int k = 0;
                    k = fourthID[i];
                    fourthID[i] = fourthID[j];
                    fourthID[j] = k;
                }
            }
        }
        System.out.println(firstID.length + secondID.length + thirdID.length + fourthID.length);
        for (int i = firstID.length - 1; i >= 0; i--) {
            if (firstID[i] != 0) {
                System.out.print(firstID[i]);
                System.out.print(" ");
                System.out.print(moral.get(firstID[i]));
                System.out.print(" ");
                System.out.println(talent.get(firstID[i]));
            }
        }
        for (int i = secondID.length - 1; i >= 0; i--) {
            if (secondID[i] != 0) {
                System.out.print(secondID[i]);
                System.out.print(" ");
                System.out.print(moral.get(secondID[i]));
                System.out.print(" ");
                System.out.println(talent.get(secondID[i]));
            }
        }
        for (int i = thirdID.length - 1; i >= 0; i--) {
            if (thirdID[i] != 0) {
                System.out.print(thirdID[i]);
                System.out.print(" ");
                System.out.print(moral.get(thirdID[i]));
                System.out.print(" ");
                System.out.println(talent.get(thirdID[i]));
            }
        }
        for (int i = fourthID.length - 1; i >= 0; i--) {
            if (fourthID[i] != 0) {
                System.out.print(fourthID[i]);
                System.out.print(" ");
                System.out.print(moral.get(fourthID[i]));
                System.out.print(" ");
                System.out.println(talent.get(fourthID[i]));
            }
        }
    }

    public static int compare(int i, int j) {
        if (moral.get(i) >= Low && talent.get(i) >= Low) {
            if (total.get(i) > total.get(j)) {
                return 0;
            } else {
                if (total.get(i).equals(total.get(j))) {
                    if (moral.get(i) > moral.get(j)) {
                        return 0;
                    } else {
                        if (moral.get(i).equals(moral.get(j))) {
                            if (index.get(i) > index.get(j)) {
                                return 1;
                            } else {
                                return 0;
                            }
                        } else {
                            return 1;
                        }
                    }
                } else {
                    return 1;
                }
            }

        } else {
            return -1;
        }

    }
}
