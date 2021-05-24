/*
 * @lc app=leetcode.cn id=241 lang=java
 *
 * [241] 为运算表达式设计优先级
 */

// @lc code=start
class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> ret=new ArrayList<>();
        for(int i=0;i<expression.length();++i){
            char c=expression.charAt(i);
            if (c=='+' || c=='-' || c=='*'){
                List<Integer> l=diffWaysToCompute(expression.substring(0,i));
                List<Integer> r=diffWaysToCompute(expression.substring(i+1));
                for(int li:l){
                    for(int ri:r){
                        switch(c){
                            case '+':
                                ret.add(li+ri);
                                break;
                            case '-':
                                ret.add(li-ri);
                                break;
                            case '*':
                                ret.add(li*ri);
                                break;  
                        }
                    }
                }
            }
        }
        if(ret.size()==0){
            ret.add(Integer.valueOf(expression));
        }
        return ret;
    }
}
// @lc code=end

