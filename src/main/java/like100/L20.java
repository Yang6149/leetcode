package like100;

import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Deque;

public class L20 {
    public boolean isValid(String s) {
        if(s.length()<1)return true;
        char [] chars=s.toCharArray();
        Deque<Character> stack=new ArrayDeque<>();
        for(int i=0;i<chars.length;i++){//只有  peek={时 只有{
            if(stack.peek()==null){
                stack.push(chars[i]);
                continue;
            }
            if(stack.peek()=='('){
                if(chars[i]==')'){
                    stack.pop();
                }else{
                    stack.push(chars[i]);
                }
                continue;
            }
            if(stack.peek()=='{'){
                if(chars[i]=='}'){
                    stack.pop();
                }else{
                    stack.push(chars[i]);
                }
                continue;
            }
            if(stack.peek()=='['){
                if(chars[i]==']'){
                    stack.pop();
                }else{
                    stack.push(chars[i]);
                }
                continue;
            }
        }
        return stack.size()>0 ? false:true;
    }
    @Test
    public void test(){
        //Deque<Character> stack=new ArrayDeque<>();
        System.out.println(isValid("{[]}"));
    }
}
