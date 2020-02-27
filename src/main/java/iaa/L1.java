package iaa;

import java.util.Scanner;

public class L1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==1){
            System.out.println(1);
            return ;
        }else if(n==0){
            System.out.println(0);
            return;
        }
        int zeng = 0;//0 ping 1 +  2 -
        int pre = sc.nextInt();
        int res=0;
        for(int i=1;i<n;i++){
            int cur = sc.nextInt();
            if(zeng==0){
                if(cur>pre){
                    zeng=1;
                }else if(cur<pre)zeng=2;
            }else if(zeng==1){
                if(cur<=pre){
                    res++;
                    zeng=0;
                }
            }else if(zeng==2){
                if(cur>=pre){
                    res++;
                    zeng=0;
                }
            }
            pre=cur;
        }
        System.out.println(res);
    }
}
