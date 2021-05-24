/*
 * @lc app=leetcode.cn id=406 lang=java
 *
 * [406] 根据身高重建队列
 */

// @lc code=start
class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people,new Comparator<int[]>(){
            @Override
            public int compare(int[] a,int[] b){
                return a[0]==b[0]?a[1]-b[1]:b[0]-a[0];
            }
        });
        int n=people.length;
        int[] index=new int[n];
        for(int i=0;i<n;++i){
            index[i]=people[i][1];
            for(int j=i-1;j>=0;--j){
                if(index[j]>=index[i]){
                    index[j]++;
                }
            }
        }
        int[][] queue=new int[n][2];
        for(int i=0;i<n;++i){
            queue[index[i]]=people[i];
        }
        return queue;
    }
}
// @lc code=end

