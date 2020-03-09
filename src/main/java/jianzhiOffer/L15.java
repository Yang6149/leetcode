package jianzhiOffer;

import org.junit.Test;

public class L15 {
    public int NumberOf1(int n) {
        int res=0;

        while(n!=0){
            if((n&1)==1)res++;
            n=n>>>1;
        }
        return res;
    }

    @Test
    public void main(){
        System.out.println(NumberOf1(1));
    }
}
