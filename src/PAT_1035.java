/**
 * Created by Gavin.Stevenson on 2017/1/14.
 */
public class PAT_1035 {
    public static int[] insertSort(int[] num) {
        int tmp = 0;
        for (int i = 1; i < num.length; i++) {
            int j = i - 1;
            tmp = num[i];
            while (j >= 0 && num[j] > tmp) {
                num[j + 1] = num[j];
                j--;
            }
//            j��whileѭ���ж����1������Ҫ�ӻ���
            num[j+1] = tmp;
        }

        return num;
    }

}
