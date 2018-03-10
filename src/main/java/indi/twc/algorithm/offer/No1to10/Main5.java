package indi.twc.algorithm.offer.No1to10;

import java.util.Stack;

/**
 * 用两个栈实现队列
 */
public class Main5 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if (stack2.size() > 0) {
            return stack2.pop();
        } else {
            if (stack1.size() > 0){
                while (stack1.size() > 0) {
                    stack2.push(stack1.pop());
                }
                return stack2.pop();
            } else {
                return 0;
            }
        }
    }
}
