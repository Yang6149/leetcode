package mockInterview.phone1;

import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Queue;

public class L1 {
    public int lengthOfLongestSubstring(String s) {
        char [] chars=s.toCharArray();
        int head=0;
        int teal=0;
        int maxNum=0;
        Queue<Character> queue=new ArrayDeque<>();
        for (int i=0;i<chars.length;i++){
            if (queue.contains(chars[i])){
                while(queue.poll()!=chars[i]){
                    head++;
                }
                head++;
            }
            queue.add(chars[i]);
            teal++;
            maxNum=Math.max(maxNum,teal-head);
        }
        return maxNum;

    }

    @Test
    public void test(){
        System.out.println(lengthOfLongestSubstring("abcad"));
    }
}
