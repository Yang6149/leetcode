package like100;

import org.junit.Test;

public class L279 {
    static int [] num=new int[1];
    public int numSquares(int n) {
        int begin=num.length;
        if(n>=num.length){
            int [] newNums=new int[n+1];
            for (int i=0;i<num.length;i++){
                newNums[i]=num[i];
            }
            num=newNums;
        }

        for(int i=begin;i<=n;i++){
            int min=Integer.MAX_VALUE;
            for(int j=1;j*j<=i;j++){
                min=Math.min(num[i-j*j]+1,min);
            }
            num[i]=min;
        }
        return num[n];
    }

    @Test
    public void test(){
        System.out.println(numSquares(4));
        System.out.println(numSquares(5));
    }

}
