package like100;

public class L338 {
    public int[] countBits(int num) {
        int [] dp = new int[num+1];
        int size=1;
        int bigsize=2;
        for (int i=2;i<=num;i++){
            if (i==bigsize){
                size=size<<1;
                bigsize=bigsize<<1;
            }
            dp[i]=dp[i-size]+1;
        }
        return dp;
    }

    //1 2 3 4 5
    //1 1 2 1 2
}
