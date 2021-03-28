package homework.week3;

/**
 * 647. 回文子串
 * 给定一个字符串，你的任务是计算这个字符串中有多少个回文子串。
 * 具有不同开始位置或结束位置的子串，即使是由相同的字符组成，也会被视作不同的子串。
 */
public class CountSubstrings {

    public static void main(String[] args) {

    }
    public static int countSubstrings(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        int nums = s.length();

        for (int i = n - 1; i >= 0; i--) {
            dp[i][i] = 1;
            for (int j = i + 1; j < n; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    if (j - i < 3){
                        dp[i][j] = 1;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                }
                if (dp[i][j]==1) {
                    nums++;
                }
            }
        }
        return nums;
    }
}
