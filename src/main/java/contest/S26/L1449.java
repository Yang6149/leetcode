package contest.S26;

import org.junit.Test;

import java.util.HashSet;

public class L1449 {
    public String largestNumber(int[] cost, int target) {
        int [][] dp = new int[target+1][10];//9->num,0-8
        pre(cost);
        for(int i = 1;i<dp.length;i++){
            for(int n= 8;n>=0;n--){
                if(cost[n]==-1)continue;
                if(i-cost[n]>=0){
                    if(i-cost[n]>0&&dp[i-cost[n]][9]<1){
                        continue;
                    }
                    int [] thisN = newInt(dp[i-cost[n]],n);
                    if(bigger(thisN,dp[i])){
                        dp[i] = thisN;
                    }
                }

            }
        }

        String res = "";
        for(int i = 8;i>=0;i--){
            while(dp[target][i]>0){
                res+=(i+1);
                dp[target][i]--;
            }
        }
        return res;
    }

    public int [] newInt(int [] old,int s){
        int [] res = new int [10];
        for(int i = 0;i<old.length;i++){
            res[i] = old[i];
        }
        res[s]++;
        res[9]++;
        return res;
    }
    public boolean bigger(int [] nums1,int [] dp){
        for(int i = 9;i>=0;i--){
            if(nums1[i]!=dp[i]){
                return nums1[i]>dp[i];
            }
        }
        return false;
    }



    public void pre(int [] cost){
        HashSet<Integer> set = new HashSet<>();
        for(int i = 8;i>=0;i--){
            if(set.contains(i)){
                cost[i]=-1;
            }else{
                set.add(i);
            }
        }

    }

    @Test
    public void test(){
        int [] n = {4,3,2,5,6,7,2,5,5};
        System.out.println(largestNumber(n,9));
    }
}
