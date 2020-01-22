package like100;

import java.util.Stack;

public class L155 {

    Stack<Integer> stack = new Stack<>();
    int min=Integer.MAX_VALUE;
    public L155() {

    }

    public void push(int x) {
        if(x<=min){
            stack.push(min);
            min=x;
        }
        stack.push(x);
    }

    public void pop() {
        if(min==stack.pop())min=stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min;
    }


}
