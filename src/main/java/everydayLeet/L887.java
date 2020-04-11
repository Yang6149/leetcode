package everydayLeet;

import org.junit.Test;

public class L887 {
    int dp[][];
    public int superEggDrop(int K, int N) {
        dp= new int[K+1][N+1];
        return dpp(K,N);

    }
    public int dpp(int K,int N){
        if (K==1) return N;
        if (N==0) return 0;
        if (dp[K][N]!=0){
            return dp[K][N];
        }
        int res = Integer.MAX_VALUE;
        int lo=1,hi=N;
        while(lo <= hi){
            int mid = (lo+ hi)/2;
            int broken = dpp(K-1,mid-1);
            int not_broken = dpp(K,N-mid);
            if (broken>not_broken){
                hi = mid-1;
                res = Math.min(res,broken+1);
            }else{
                lo = mid+1;
                res = Math.min(res,not_broken+1);
            }
        }

        dp[K][N]=res;
        return dp[K][N];
    }

    @Test
    public void test(){
        System.out.println(superEggDrop(2,100));
    }



}
