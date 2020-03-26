package gongsi.mt2020spring;

import java.util.Scanner;

//有一个2*n的网格，有一个人位于(1,1)的位置，即左上角，他希望从左上角走到右下角，即(2,n)的位置。在每一次，他可以进行三种操作中的一种：
//
//        1． 向右走一格，即从(x,y)到(x,y+1);
//
//        2． 向上右方走一格，即，如果他在(2,y)的位置可以走到(1,y+1);
//
//        3． 向下右方走一格，即，如果他在(1,y)的位置可以走到(2,y+1);
//        问题当然不会这么简单，在这2*n的格子中，有一部分格子上有障碍物，他不能停在障碍物上，当然也不能走出网格，
//        请问他有多少种不同的路线可以到达(2,n)。
public class L1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        if(length<=1){
            System.out.println(0);
            return ;
        }
        in.nextLine();

        String up1=in.nextLine();
        String down1=in.nextLine();
        char[] chars = up1.toCharArray();

        char[] chars2 = down1.toCharArray();

//        long [][] dp = new long[length][2];
////        dp[length-1][1]=1;
////        for (int i=dp.length-2;i>=0;i--){
////            if(chars[i]=='.'){
////                dp[i][0]=dp[i+1][0]+dp[i+1][1];
////            }
////            if(chars2[i]=='.'){
////                dp[i][1]=dp[i+1][0]+dp[i+1][1];
////            }
////        }
////        if(chars2[chars2.length-1]!='.'){
////            System.out.println(-1);
////            return;
////        }
////        if(dp[0][0]==0){
////            System.out.println(-1);
////            return ;
////        }
        long res = 1;

        for (int i=chars.length-1-1;i>=0;i--){
            if(chars[i]=='.'&&chars2[i]=='.'){
                res*=2;
            }else if(!(chars[i]=='.'||chars2[i]=='.')){
                res=0;
            }
        }
        if(res==0){
            System.out.println(-1);
        }
        System.out.println(res);
    }
}
