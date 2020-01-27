package like100;

import org.junit.Test;

import java.util.ArrayList;

public class L394 {
    public String decodeString(String s) {
        int count=0;
        int index=0;
        int pre=index;
        ArrayList<String> list = new ArrayList<>();
        while (index<s.length()){
            if (s.charAt(index)=='['){
                count++;
            }
            if (s.charAt(index)==']'){
                count--;
                if (count==0){
                    list.add(s.substring(pre,index+1));
                    pre=index+1;
                }
            }
            index++;
        }
        list.add(s.substring(pre));
        String res="";
        for (String s1 : list) {
            res+=recurit(s1);
        }
        return res;
    }
    public String recurit(String s){
        int pre=0;
        int teal=s.length()-1;
        while (teal>=0&&s.charAt(teal)!=']')teal--;
        if (teal!=-1){
            while (!(s.charAt(pre)>='0'&&s.charAt(pre)<='9')){
                pre++;
            }
        }
        String mid="";
        if (teal>pre){
            int num=pre;
            while (s.charAt(num)!='[')num++;
            String dan=decodeString(s.substring(num+1,teal));
            for (int i=0;i<Integer.parseInt(s.substring(pre,num));i++){
                mid+=dan;
            }
        }
        return s.substring(0,pre)+mid+s.substring(teal+1,s.length());
    }
    //public
    @Test
    public void test(){
        System.out.println(decodeString("3[a2[c]]"));
    }
}
