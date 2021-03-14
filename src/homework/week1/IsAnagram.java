package homework.week1;

import java.util.HashMap;
import java.util.Map;

public class IsAnagram {
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        System.out.println(isAnagram(s,t));
    }

    public static boolean isAnagram(String s, String t) {
        if (s == null || t == null) {
            return false;
        }
        if (s.length() != t.length()) {
            return false;
        }
        int[] arr = new int[26];
        for (int i = 0; i< s.length(); i++) {
            arr[s.charAt(i) - 'a'] ++;
            arr[t.charAt(i) - 'a'] --;
        }
        for (int i=0; i < 26; i++) {
            if (arr[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
