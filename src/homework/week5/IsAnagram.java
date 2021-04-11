package homework.week5;

/**
 * 242. 有效的字母异位词
 */
public class IsAnagram {
    public static void main(String[] args) {

    }

    public static boolean isAnagram(String s, String t) {
        if (s == null || t == null) {
            return false;
        }
        if (s.length() != t.length()) {
            return false;
        }
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
        }
        for (int n : arr) {
            if (n != 0) {
                return false;
            }
        }
        return true;
    }
}
