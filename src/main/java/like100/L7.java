package like100;

import org.junit.Test;

import java.io.*;

public class L7 {
    public int reverse(int x) {
        String s = String.valueOf(x);
        if (x<0){
            s=s.substring(1);
        }
        char [] ss = s.toCharArray();
        for (int i=0;i<(s.length()+1)/2;i++){
            char a =s.charAt(i);
            ss[i]=ss[s.length()-1-i];
            ss[s.length()-1-i]=a;
        }
        int index=0;
        s=new String(ss).trim();
        if (x<0){
            if (comp(s,"2147483648"))return 0;
                s="-"+s;
        }else{
            if (comp(s,"2147483647"))return 0;
            s=s;
        }
        if (s==""|s=="-")return 0;
        return Integer.parseInt(s);
    }
    public boolean comp(String s1,String s2){
        if (s1.length()<s2.length()){
            return false;
        }else if(s1.length()>s2.length()){
            return true;
        }else{
            return s1.compareTo(s2)>0;
        }
    }
    @Test
    public void test() throws IOException {

    }
}
