package interview100;

import org.junit.Test;

public class L8 {
    public int myAtoi(String str) {
        str=str.trim();
        int begin=0;
        int teal = str.length()-1;

        while(begin<=teal&&!(str.charAt(begin)=='-'||str.charAt(begin)=='+'||(str.charAt(begin)>='0'&&str.charAt(begin)<='9')))return 0;
        if (begin>teal)return 0;
        int end=begin+1;
        while (end<=teal&&(str.charAt(end)>='0'&&str.charAt(end)<='9'))end++;
        String num = str.substring(begin,end);
        String realNum=num;
        String fuhao="";
        if (realNum.charAt(0)=='-'||realNum.charAt(0)=='+'){
            fuhao=realNum.substring(0,1);
            realNum=realNum.substring(1,realNum.length());
        }
        while (realNum.length()>0&&realNum.charAt(0)=='0')realNum=realNum.substring(1);
        if ((fuhao.equals("")||fuhao.equals("+"))&&((realNum.length()==10&&realNum.compareTo("2147483647")>0)||realNum.length()>10)){
            return 2147483647;
        }else if(fuhao.equals("-")&&(realNum.length()>10||(realNum.length()==10&&realNum.compareTo("2147483648")>0))){
            return -2147483648;
        }
        if (realNum.length()==0)return 0;
        return Integer.valueOf(fuhao+realNum);

    }
    @Test
    public void test(){
        System.out.println(myAtoi("-0000000006511321adfsf"));
    }
}
