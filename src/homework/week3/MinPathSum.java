package homework.week3;

/**
 * 64. 最小路径和
 */
public class MinPathSum {

    public static void main(String[] args) {

    }
    public static int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length + 1][grid[0].length + 1];
        for(int i = 0; i < grid.length; i++) {
            for( int j = 0; j < grid[i].length; j++) {
                if (i == 0) {
                    dp[i + 1][j + 1] = grid[i][j] + dp[i + 1][j];
                } else if (j == 0) {
                    dp[i + 1][j + 1] = grid[i][j] + dp[i][j + 1];
                } else {
                    dp[i + 1][j + 1] = Math.min(dp[i][j + 1], dp[i + 1][j]) + grid[i][j];
                }

            }
        }
        return dp[grid.length][grid[0].length];
    }
}
