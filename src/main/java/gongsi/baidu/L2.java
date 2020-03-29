package gongsi.baidu;

import java.util.Scanner;

public class L2 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            long[] num = getNum(in);
            int curMax=0;
            for(int i=1;i<num.length;i++){
                if(num[curMax]<num[i]){
                    curMax=i;
                }
            }
            int res = 0;
            while(num[curMax]>=num.length){
                res++;
                long max = num[curMax]-num.length;
                int maxIndex = 0;
                for(int i=0;i<num.length;i++){
                    if (i==curMax){
                        num[i]-=num.length;
                    }else{
                        num[i]--;
                    }
                    if (num[i]>max){
                        max=num[i];
                        maxIndex = i;
                    }
                }
                curMax=maxIndex;
            }
            System.out.println(res);
        }
    }

    public static long[] getNum(Scanner in){
        int num = in.nextInt();
        long [] r = new long[num];
        for(int i=0;i<num;i++){
            r[i]=in.nextLong();
        }
        return r;
    }
}
