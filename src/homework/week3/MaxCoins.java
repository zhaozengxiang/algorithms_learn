package homework.week3;

/**
 * 312. 戳气球
 * 有 n 个气球，编号为0 到 n - 1，每个气球上都标有一个数字，这些数字存在数组 nums 中。
 * 现在要求你戳破所有的气球。戳破第 i 个气球，你可以获得 nums[i - 1] * nums[i] * nums[i + 1] 枚硬币。 这里的 i - 1 和 i + 1 代表和 i 相邻的两个气球的序号。如果 i - 1或 i + 1 超出了数组的边界，那么就当它是一个数字为 1 的气球。
 * 求所能获得硬币的最大数量。0
 */
public class MaxCoins {
    public static void main(String[] args) {

    }

    public static int maxCoins(int[] nums) {
        int length = nums.length;
        //处理边界情况
        int[] temp = new int[length + 2];
        temp[0] = 1;
        temp[length + 1] = 1;
        System.arraycopy(nums, 0, temp, 1, length);
        int[][] dp = new int[length + 2][length + 2];
        for(int len = 3; len <= length + 2; len++) {
            for (int i = 0; i<= length + 2 - len; i++){
                int res = 0;
                for(int k = i + 1; k < i + len - 1; k++){
                    int left = dp[i][k];
                    int right = dp[k][i + len - 1];
                    res = Math.max(res, left + temp[i] * temp[k] * temp[i + len - 1] + right);
                }
                dp[i][i + len - 1] = res;
            }
        }
        return dp[0][length + 1];
    }
}
