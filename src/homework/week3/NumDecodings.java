package homework.week3;

/**
 * 91. 解码方法
 */
public class NumDecodings {
    public static void main(String[] args) {

    }
    public static int numDecodings(String s) {
        char[] chars = s.toCharArray();
        if (chars[0] == '0') {
            return 0;
        }
        int[] dp = new int[chars.length];
        dp[0] = 1;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == '0') {
                if (chars[i - 1] != '1' && chars[i - 1] != '2') return 0;
                dp[i] = i == 1 ? 1 : dp[i - 2];
            } else if (chars[i - 1] == '1' || (chars[i - 1] == '2' && chars[i] >= '1' && chars[i] <= '6')) {
                dp[i] = i == 1 ? dp[i - 1] + 1 : dp[i - 1] + dp[i - 2];
            } else {
                dp[i] = dp[i - 1];
            }
        }
        return dp[chars.length - 1];
    }
}
