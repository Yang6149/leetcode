package iaa;

import java.util.Scanner;

public class L3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] p = new int[n];
        int [] q = new int[n];
        int positiveP=0;
        int negativeS=0;
        for(int i=0;i<n;i++){
            p[i] = sc.nextInt();
            q[i] = sc.nextInt();
        }
        int [] l = new int[n];
        long res = 0;
        int firstP = 0;
        int firstQ = 0;
        for(int i=0;i<n;i++){
            l[i]=q[i]-p[i];
            if(l[i]>0&&i==0){
                firstP=p[i];
                firstQ=q[i];
            }
            if(l[i]>0){
                positiveP = Math.max(positiveP,p[i]);
                res+=l[i];
            }else{
                negativeS = Math.max(negativeS,p[i]+q[i]);
            }
        }
        if(positiveP==firstP){
            System.out.println(positiveP+firstQ);
        }else{
            if(positiveP>negativeS){

                System.out.println(res+positiveP*2);
            }else{
                System.out.println(res+negativeS);
            }
        }



    }
}
