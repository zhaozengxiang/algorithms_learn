package homework.week5;

/**
 * 1122. 数组的相对排序
 */
public class RelativeSortArray {
    public static void main(String[] args) {

    }

    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] res = new int[1001];
        for (int n : arr1) {
            res[n]++;
        }
        int i = 0;
        for (int n : arr2) {
            while (res[n]-- > 0) {
                arr1[i++] = n;
            }
        }
        for (int j = 0; j < res.length; j++) {
            while (res[j]-- > 0) {
                arr1[i++] = j;
            }
        }
        return arr1;
    }
}
