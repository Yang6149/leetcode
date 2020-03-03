package gongsi.tencent2020q;

import java.util.Scanner;

public class L4 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int [] a = new int[num];
        int [] b = new int[num];
        for(int i=0;i<num;i++){
            a[i]=in.nextInt();
        }
        for(int i=0;i<num;i++){
            b[i]=in.nextInt();
        }
        int statu = -1;//0 休息  1 工作  2 健身

        int [] a0 = new int[num];
        int [] a1 = new int[num];
        int [] a2 = new int[num];
        a0[0]=1;
        if(a[0]==0)a1[0]++;
        if(b[0]==0)a2[0]++;
        for(int i=1;i<num;i++){
            a0[i]=Math.min(a1[i-1],a2[i-1])+1;
            if(a[i]==1){
                a1[i]=Math.min(a0[i-1],a2[i-1]);
            }else{
                a1[i]=a1[i-1]+1;
            }
            if(b[i]==1){
                a2[i]=Math.min(a0[i-1],a1[i-1]);
            }else{
                a2[i]=a2[i-1]+1;
            }
        }
        int res = Math.min(a1[num-1],a2[num-1]);
        System.out.println(res);
    }
}
