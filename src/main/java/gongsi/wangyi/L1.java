package gongsi.wangyi;

import java.util.Arrays;
import java.util.Scanner;

public class L1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            boolean flag = true;
            int n = sc.nextInt();
            int m = sc.nextInt();
            int s = sc.nextInt();
            int L[] = new int [n];
            L[s-1]=1;
            for(int i=0;i<m;i++){
                int x = sc.nextInt();
                int y = sc.nextInt();
                if(x==0){
                    if (y==s){
                        Arrays.fill(L,1);
                    }else{
                        L[y-1]=1;
                    }
                }else{
                    if(x==s){
                        L[y-1]=1;
                    }else if(y==s){
                        L[x-1]=1;
                    }
                }
                boolean bb = true;
                for(int j = 0;j<n;j++){
                    if(L[j]==0){
                        //没被封
                        bb=false;
                        break;
                    }
                }
                if(bb){
                    System.out.println(i+1);
                }
                flag = bb;
            }
            if(!flag){
                System.out.println(0);
            }


        }
    }
}
