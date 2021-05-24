/*
 * @lc app=leetcode.cn id=155 lang=java
 *
 * [155] 最小栈
 */

// @lc code=start
class MinStack {
    private Stack<Integer>  DataStack;
    private Stack<Integer>  MinStack;
    private int min;
    /** initialize your data structure here. */
    public MinStack() {
        DataStack=new Stack<Integer>();
        MinStack=new Stack<Integer>();
        min=Integer.MAX_VALUE;
    }
    
    public void push(int x) {
        DataStack.push(x);
        min=Math.min(min,x);
        MinStack.push(min);
    }
    
    public void pop() {
        DataStack.pop();
        MinStack.pop();
        min=MinStack.isEmpty()?Integer.MAX_VALUE:MinStack.peek();
    }
    
    public int top() {
        return DataStack.peek();
    }
    
    public int getMin() {
        return MinStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
// @lc code=end

