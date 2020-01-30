package like100;

import org.junit.Test;

public class L647 {
    public int countSubstrings(String s) {
        if(s.length()<2)return 1;
        char [] chars=s.toCharArray();
        int max=0;
        int count=0;
        for(int i=0;i<chars.length;i++){

            char a=chars[i];
            int left=0;
            //i=index
            for(int j=0;j<=i;j++){
                if(j+i==chars.length||i-j<0)break;
                if(chars[i-j]==chars[i+j]){
                    count++;
                }else{
                    break;
                }

            }
            for(int j=0;j<=i;j++){
                if(i+j+1==chars.length||i-j<0)break;
                if(chars[i-j]==chars[i+j+1]){
                    count++;
                }else{
                    break;
                }

            }
        }
        return count;
    }
    @Test
    public void test(){
        System.out.println(countSubstrings("aa"));
    }
}
