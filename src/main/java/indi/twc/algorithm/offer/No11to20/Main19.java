package indi.twc.algorithm.offer.No11to20;


import java.util.Stack;

/**
 * 包含min函数的栈
 */
public class Main19 {
    private Stack<Integer> stack = new Stack<>();

    private Stack<Integer> helpStack = new Stack<>();

    public void push(int node) {
        stack.push(node);
        if (helpStack.size() == 0) {
            helpStack.push(node);
        } else {
            int data = helpStack.peek();

            if (node > data) {
                helpStack.push(data);
            } else {
                helpStack.push(node);
            }
        }
    }

    public void pop() {
        stack.pop();
        helpStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return helpStack.peek();
    }

}
