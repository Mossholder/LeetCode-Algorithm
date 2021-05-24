/*
 * @lc app=leetcode.cn id=354 lang=java
 *
 * [354] 俄罗斯套娃信封问题
 */

// @lc code=start
class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        //宽度升序，宽度相同时高度降序
        int len=envelopes.length;
        if(len==0)  return 0;
        Arrays.sort(envelopes,new Comparator<int[]>(){
            public int compare(int[] a,int[] b){
                return a[0]==b[0]?b[1]-a[1]:a[0]-b[0];
            }
        });
        int[] height=new int[len];
        for(int i=0;i<len;++i){
            height[i]=envelopes[i][1];
        }
        return lengthOfLIS(height);
    }

    private int lengthOfLIS(int[] nums) {
        int len=nums.length;
        int[] dp=new int[len];
        Arrays.fill(dp,1);
        for(int i=1;i<len;++i){
            int max_len=1;
            for(int j=0;j<i;++j){
                if(nums[i]>nums[j]){
                    max_len=Math.max(dp[j]+1,max_len);
                }
            }
            dp[i]=max_len;
        }
        return Arrays.stream(dp).max().getAsInt();
    }
}
// @lc code=end

