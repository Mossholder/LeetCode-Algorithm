/*
 * @lc app=leetcode.cn id=860 lang=java
 *
 * [860] 柠檬水找零
 */

// @lc code=start
class Solution {
    public boolean lemonadeChange(int[] bills) {
        int[] cnt=new int[2];
        for(int i=0;i<bills.length;++i){
            if(bills[i]==5){
                cnt[0]++;
            }else if(bills[i]==10){
                cnt[1]++;
                if(cnt[0]==0){
                    return false;
                }
                cnt[0]--;
            }else{
                if(cnt[0]>0 && cnt[1]>0){
                    cnt[0]--;
                    cnt[1]--;
                }else if(cnt[0]>=3){
                    cnt[0]-=3;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}
// @lc code=end

