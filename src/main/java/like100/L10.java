package like100;

import org.junit.Test;

public class L10 {
    public boolean isMatch(String s, String p) {
        if (s.length()==0&&p.length()==0){
            return true;
        }
        if (p.length()==0)return false;
        if (p.charAt(0)=='.'){
            if (p.length()>1&&p.charAt(1)=='*'){
                //loop
                for (int i=0;i<=s.length();i++){
                    if (isMatch(s.substring(i),p.substring(2))){
                        return true;
                    }
                }
            }else {
                if (s.length()>0&&isMatch(s.substring(1),p.substring(1))){
                    return true;
                }
            }
        }else {
            if (p.length()>1&&p.charAt(1)=='*'){

                for (int i=0;i<=s.length();i++){
                    if (isMatch(s.substring(i),p.substring(2))){
                        return true;
                    }
                    if (i==s.length()||s.charAt(i)!=p.charAt(0))break;

                }
            }else {
                if (s.length()>0&&p.charAt(0)==s.charAt(0)){
                    if (isMatch(s.substring(1),p.substring(1))){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Test
    public void test(){
        String s = "a";
        String p = "ab*";
        System.out.println(isMatch(s,p));
    }
}
