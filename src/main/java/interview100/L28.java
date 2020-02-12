package interview100;

import org.junit.Test;

public class L28 {
    public int strStr(String haystack, String needle) {
        if(needle.length()==0)return 0;
        if(haystack.length()==0)return -1;

        boolean flag=true;
        for(int i=0;i<haystack.length()-needle.length()+1;i++){
            flag=true;
            for(int j=0;j<needle.length();j++){
                if(haystack.charAt(i+j)!=needle.charAt(j)){
                    flag=false;
                    break;
                }
            }
            if(flag)return i;

        }
        return -1;
    }
    @Test
    public void test(){
        String s1 = "mississippi";
        String s2 = "issip";
        System.out.println(strStr(s1,s2));

    }
}
