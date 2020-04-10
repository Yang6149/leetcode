package everydayLeet;

import org.junit.Test;

public class L151 {
    public String reverseWords(String s) {
        String str = s.trim();
        String []strs = s.split(" ");
        String res = "";
        for(int i=strs.length-1;i>=0;i--){
            //if (strs[i]==" ")continue;
            res+=" "+strs[i];
            res=res.trim();
        }
        return res;
    }
    @Test
    public void test(){
        String s = "a good   example";
        System.out.println(reverseWords(s));
    }
}
