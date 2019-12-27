package pickOne;

import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Deque;

public class L5 {
    public String longestPalindrome(String s) {
        if(s.length()<2)return s;
        char [] chars=s.toCharArray();
        String result=s.substring(0,1);
        int max=0;
        for(int i=1;i<chars.length;i++){

            char a=chars[i];
            int left=0;
            //i=index
            for(int j=1,cur=1;j<=i;j++){
                if(j+i==chars.length)break;
                if(chars[i-j]==chars[i+j]){
                    cur+=2;
                }else{
                    break;
                }
                if(cur>max){
                    max=cur;
                    result=String.copyValueOf(chars,i-j,2*j+1);
                }
            }
            for(int j=1,cur=0;j<=i;j++){
                if(i+j-1==chars.length)break;
                if(chars[i-j]==chars[i+j-1]){
                    cur+=2;
                }else{
                    break;
                }
                if(cur>max){
                    max=cur;
                    result=String.copyValueOf(chars,i-j,2*j);
                }
            }


        }
        return result;
    }
    @Test
    public void test(){
        String s="aaaa";
        System.out.println(longestPalindrome(s));
    }
}
