package like100;

import org.junit.Test;

import java.util.Arrays;

public class L322 {
    public int coinChange(int[] coins, int amount) {
        if (amount<0)return -1;
        int [] dp=new int[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0]=0;
        for (int i=1;i<=amount;i++){
            for (int j=0;j<coins.length;j++){
                if(coins[j]<=i){
                    dp[i]=Math.min(dp[i],dp[i-coins[j]]+1);
                }
            }

        }
        return dp[amount]>amount?-1:dp[amount];
    }
    // 2  5
    //2

    @Test
    public void test(){
        int [] coins={2,5};
        System.out.println(coinChange(coins,11));
    }
}
