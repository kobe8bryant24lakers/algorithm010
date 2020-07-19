//在一个由 0 和 1 组成的二维矩阵内，找到只包含 1 的最大正方形，并返回其面积。
//
// 示例:
//
// 输入:
//
//1 0 1 0 0
//1 0 1 1 1
//1 1 1 1 1
//1 0 0 1 0
//
//输出: 4
// Related Topics 动态规划


package com.shuzijun.leetcode.editor.en;

public class MaximalSquare {
    public static void main(String[] args) {
        Solution solution = new MaximalSquare().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int maximalSquare(char[][] matrix) {
            int rows = matrix.length;
            if (rows == 0) {
                return 0;
            }
            int cols = matrix[0].length;
            int[][] dp = new int[rows + 1][cols + 1];
            int maxSide = 0;
            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= cols; j++) {
                    if (matrix[i - 1][j - 1] == '0') {
                        dp[i][j] = 0;
                    } else {
                        dp[i][j] = Math.min(dp[i - 1][j], Math.min(dp[i][j - 1], dp[i - 1][j - 1])) + 1;
                        maxSide = Math.max(dp[i][j], maxSide);
                    }
                }
            }
            return maxSide * maxSide;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}
