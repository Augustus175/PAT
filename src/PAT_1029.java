import java.util.*;

/**
 * Created by Gavin.Stevenson on 2017/1/9.
 */
public class PAT_1029 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        List<Character> char1 = new ArrayList<Character>();
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            if ((c >= 97) && (c <= 122)) {
                c = (char) (c - 32);
            }
            char1.add(c);
        }

        for (int j = 0; j < str2.length(); j++) {
            for (int i = 0, len = char1.size(); i < len; ++i) {
                char c = str2.charAt(j);
                if ((c >= 97) && (c <= 122)) {
                    c = (char) (c - 32);
                }
                if (char1.get(i) == c) {
                    char1.remove(i);
                    --len;
                    --i;
                }
            }
        }
        List newlist = removeDuplicateWithOrder(char1);
        for (int i = 0; i < newlist.size(); i++) {
            System.out.print(newlist.get(i));
        }
    }

    public static List removeDuplicateWithOrder(List list) {
        Set set = new HashSet();
        List newList = new ArrayList();
        for (Iterator iter = list.iterator(); iter.hasNext(); ) {
            Object element = iter.next();
            if (set.add(element))
                newList.add(element);
        }
        list.clear();
        list.addAll(newList);
        return list;
    }
}
