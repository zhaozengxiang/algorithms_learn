package homework.week5;

/**
 * 541. 反转字符串 II
 */
public class ReverseStr {
    public static void main(String[] args) {

    }

    public static String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        int i = 0;
        while (i < n) {
            int j = Math.min(i + k - 1, n - 1);
            swap(arr, i, j);
            i += 2 * k;
        }
        return new String(arr);
    }

    private static void swap(char[] arr, int l, int r) {
        while (l < r) {
            char temp = arr[l];
            arr[l++] = arr[r];
            arr[r--] = temp;
        }
    }
}
