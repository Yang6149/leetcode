package like100;

import org.junit.Test;

import java.util.Arrays;

public class L309 {
    public int maxProfit(int[] prices) {
        int preSell=0,sell=0;
        int buy=-prices[0];
        for (int price : prices) {
            int lastbuy=buy;
            int lastSell=sell;
            buy=Math.max(buy,preSell-price);
            sell=Math.max(sell,lastbuy+price);
            preSell=lastSell;
        }
        return sell;
    }

    //buy[i]=max(buy[i-1],sell[i-2]-price);
    //sell[i]=max(sell[i-1],buy[i-1]+price);

    //buy[5]=max(buy[4],max(res))

    @Test
    public void test(){
        int [] prices = {6,1,6,4,3,0,2};
        System.out.println(maxProfit(prices));
    }
}
