/*
 * @lc app=leetcode.cn id=650 lang=java
 *
 * [650] 只有两个键的键盘
 */

// @lc code=start
class Solution {

  public int minSteps(int n) {
    int[] dp = new int[n];
    for (int i = 1; i < n; ++i) {
      dp[i] = i + 1;
      int num = (int) Math.sqrt(i + 1);
      for (int j = 2; j <= num; ++j) {
        if ((i + 1) % j == 0) 
          dp[i] = dp[j - 1] + dp[(i + 1) / j - 1];
      }
    }
    return dp[n - 1];
  }
}
// @lc code=end
