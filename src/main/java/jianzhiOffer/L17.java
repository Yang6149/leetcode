package jianzhiOffer;

import org.junit.Test;

public class L17 {
    public void print1ToMaxOfNDigits(int n) {
        if (n <= 0)
            return;
        char[] number = new char[n];
        print1ToMaxOfNDigits(number, 0);
    }

    public void print1ToMaxOfNDigits(char [] a,int g){
        if(g==a.length){
            pr(a);
            return;
        }
        for(int i=0;i<10;i++){
            char c = (char)('0'+i);
            a[g]=c;
            print1ToMaxOfNDigits(a,g+1);
        }
    }

    public void pr(char [] a){
        int index=0;
        while(index<a.length&&a[index]=='0')index++;
        while(index<a.length) System.out.print(a[index++]);
        System.out.println();
    }
    @Test
    public void test(){
        print1ToMaxOfNDigits(3);
    }
}
