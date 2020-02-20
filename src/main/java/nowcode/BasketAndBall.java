package nowcode;

import java.util.Scanner;

public class BasketAndBall {
    static int res=0;
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();//n lanzi
        int m = in.nextInt();//m zuqiu
        if(n<1){
            System.out.println(res);
            return;
        }
        int [] lanzi = new int[n];
        ins(lanzi,m,0);
        System.out.println(res);
    }
    public static void ins(int [] lanzi,int m,int begin){
        if(m==0){
            res++;
            return;
        }
        for(int i=begin;i<lanzi.length;i++){
            if(i==0||lanzi[i]<lanzi[i-1]){
                lanzi[i]++;
                ins(lanzi,m-1,i);
                lanzi[i]--;
            }

        }
    }
}
