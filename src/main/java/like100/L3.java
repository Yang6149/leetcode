package like100;

import org.junit.Test;

import java.util.Arrays;

public class L3 {
    public int lengthOfLongestSubstring(String s) {
        Arrays.sort();
        char [] chars=s.toCharArray();
        int maxNum=0;
        int [] little = new int[256];
        int right = 0;
        int left = 0;
        while(right<s.length()){
            char c = chars[right];
            little[c]++;
            right++;
            while(little[c]>1){
                char c2 = chars[left];
                little[c2]--;
                left++;
            }
            maxNum=Math.max(maxNum,right-left);
        }
        return maxNum;
    }
    @Test
    public void test(){
        System.out.println(lengthOfLongestSubstring(" "));
    }
}
