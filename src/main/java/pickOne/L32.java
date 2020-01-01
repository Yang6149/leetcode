package pickOne;

import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class L32 {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        int index = 0;
        char[] chars = s.toCharArray();
        while (index < s.length()) {
            if (chars[index] == '(') {
                stack.push(index);

            }else
            if (chars[index] == ')') {
                if(stack.isEmpty()||chars[stack.peek()] != '('){
                    stack.push(index);
                }else {
                    stack.pop();
                }
            }
            index++;
        }
        int a=0;
        int b=s.length();
        int max=0;
        int cur=0;
        if(stack.isEmpty()){
            return s.length();
        }
        while(!stack.isEmpty()){
            a=stack.pop();
            cur=b-a;
            b=a;
            if(cur>max){
                max=cur;
            }
        }
        a=-1;
        cur=b-a;
        b=a;
        if(cur>max){
            max=cur;
        }
        return max-1;
    }
    @Test
    public void test(){
        System.out.println(longestValidParentheses("())"));
    }
}
