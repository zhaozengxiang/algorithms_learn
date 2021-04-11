package homework.week5;

/**
 * 387. 字符串中的第一个唯一字符
 */
public class FirstUniqChar {
    public static void main(String[] args) {

    }

    public static int firstUniqChar(String s) {
        int[] arr = new int[26];
        for (char ch : s.toCharArray()) {
            arr[ch - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (arr[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}
