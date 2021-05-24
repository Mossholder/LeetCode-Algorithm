/*
 * @lc app=leetcode.cn id=20 lang=java
 *
 * [20] 有效的括号
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<Character>();
        for(char c:s.toCharArray()){
            if(c=='{'||c=='['||c=='(')
                stack.push(c);
            else{
                if(stack.isEmpty()) return false;
                char top=stack.pop();
                boolean b1=c==')'&&top=='(';
                boolean b2=c==']'&&top=='[';
                boolean b3=c=='}'&&top=='{';
                if(!(b1||b2||b3))   return false;
            }
        }
        return stack.isEmpty();
    }
}
// @lc code=end

