package nowcode320;

import java.util.Scanner;

public class L1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        int [][] dp = new int[str1.length()+1][str2.length()+1];

        for (int i=1;i<str2.length()+1;i++){
            dp[0][i]=i;
        }
        for (int i=1;i<str1.length()+1;i++){
            dp[i][0]=i;
        }
        //dp[i][j]为str1从第i个到str2第j个转变的最优解
        //res为 dp[str1.length()+1][str2.length()+1]
        //if(str1[i+1]==str2[j+1])dp[i+1][j+1]=dp[i][j]
        for (int i=1;i<str1.length()+1;i++){
            for(int j=1;j<str2.length()+1;j++){
                dp[i][j]=dp[i-1][j-1]+1;
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=Math.min(dp[i-1][j-1],dp[i][j]);
                }
                dp[i][j]=Math.min(dp[i][j-1]+1,dp[i][j]);
                //dp[i-1][j-1]=Math.min(dp[i][j-1]+1,dp[i][j]);
                dp[i][j]=Math.min(dp[i-1][j]+1,dp[i][j]);
            }
        }
        System.out.println("1/"+(1+dp[str1.length()][str2.length()]));
    }
}
