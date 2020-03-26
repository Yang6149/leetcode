package gongsi.al;

import org.junit.Test;

public class L3 {
    public String change (String number) {
        // write code here
        char [] str = number.toCharArray();
        int begin=0;
        int end=number.length()-1;
        while(begin<end){
            while(begin<end&&((str[begin]-48)&1)==1){
                begin++;
            }
            while(begin<end&&((str[end]-48)&1)==1){
                end--;
            }
            swap(str,begin++,end--);

        }
        return new String(str);
    }
    public void swap(char[] str,int a,int b){
        char temp = str[a];
        str[a]=str[b];
        str[b]=temp;
    }
    @Test
    public void test(){
        System.out.println(change("1234"));
    }
}
