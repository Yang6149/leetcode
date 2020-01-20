package like100;

import org.junit.Test;

import java.util.*;

public class L139 {
    public boolean wordBreak(String s, List<String> wordDict) {


        boolean [] flag=new boolean[s.length()+1];
        flag[0]=true;
        for(int i=1;i<=s.length();i++){
            for (String s1 : wordDict) {
                if(s1.length()<=i&&flag[i-s1.length()]&&s.substring(i-s1.length(),i).equals(s1)){
                    flag[i]=true;
                }
            }
        }
        return flag[s.length()];

    }



    @Test
    public void test(){
        List<String> s=Arrays.asList("a","aa","aaa","aaaa","aaaaa","aaaaaa","aaaaaaa","aaaaaaaa","aaaaaaaaa","aaaaaaaaaa");
        System.out.println(wordBreak("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab",s));
    }

}
