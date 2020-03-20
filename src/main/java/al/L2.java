package al;

import java.util.Arrays;
import java.util.Scanner;

public class L2 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int line = in.nextInt();
        int [][] adds = new int[line][4];
        in.nextLine();
        int ee=0;
        for(int i=0;i<line;i++){
            String s=in.nextLine();
            adds[i][0]=s.charAt(0);
            adds[i][1]=s.charAt(s.length()-1);
            adds[i][2]=s.length();
            ee=Math.max(ee,adds[i][1]);
        }
        Arrays.sort(adds,(a,b)->a[1]-b[1]);

        int [][] dp = new int[256][2];
        for (int i=0;i<adds.length;i++){
            int end = adds[i][1];
            int begin = adds[i][0];
            int length = adds[i][2];
            dp[end][1]=Math.max(length,dp[end][1]);
            for (int j=97;j<=begin;j++){
                if(begin==j&&begin==end&&dp[begin][0]==length){
                    continue;
                }
                dp[end][1]=Math.max((dp[j][1]+length),dp[end][1]);
                dp[end][0]=length;
            }



        }
        System.out.println(dp[ee][1]);
    }
}
