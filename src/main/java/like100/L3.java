package like100;

import org.junit.Test;

import java.util.Arrays;

public class L3 {
    public int lengthOfLongestSubstring(String s) {
        char [] chars=s.toCharArray();
        int maxNum=0;
        int [] little = new int[256];
        Arrays.fill(little,-1);
        for (int i = 0,j=0; i < chars.length; i++) {
            if (little[chars[i]]!=-1){
                j=Math.max(j,little[chars[i]]+1);
            }
            little[chars[i]]=i;
            maxNum = Math.max(maxNum,i-j+1);
        }
        return maxNum;
    }
    @Test
    public void test(){
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }
}
