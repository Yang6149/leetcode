package csnote.greedy;

import org.junit.Test;

public class L122 {
    public int maxProfit(int[] prices) {
        if(prices.length<1)return 0;
        int sum=0;
        for(int i=1;i<prices.length;i++){
            if (prices[i]>prices[i-1]){
                sum+=prices[i]-prices[i-1];
            }
        }
        return sum;
    }
    @Test
    public void test(){
        int [] a = {3,2,6,5,0,3};
        System.out.println(maxProfit(a));
    }
}
