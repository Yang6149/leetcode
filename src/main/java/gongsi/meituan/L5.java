package gongsi.meituan;

import java.util.Scanner;

public class L5 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] pi = new int[n];
        int [] ai = new int[n];
        int [] qi = new int[n];
        int [] bi = new int[n];
        for(int i=0;i<n;i++){
            pi[i]=in.nextInt();
            ai[i]=in.nextInt();
            qi[i]=in.nextInt();
            bi[i]=in.nextInt();
        }
        int time [] =new int[121];
        for(int i=1;i<=120;i++){
            for(int j=0;j<n;j++){
                if(i>=qi[j]){
                    time[i]=Math.max(time[i],time[i-qi[j]]+bi[j]);
                }else if(i>=pi[j]){
                    time[i]=Math.max(time[i],time[i-pi[j]]+ai[j]);
                }else{
                    time[i]=time[i-1];
                }
            }
        }
        System.out.println(time[0]);

    }
}
