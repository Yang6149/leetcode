package gongsi.L360;

import java.text.DecimalFormat;
import java.util.Scanner;

public class L2 {
    static double res=0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            res=0;
            int[] nums = getInput(in);
            int n=nums[0];
            int m=nums[1];
            comp(n,m,1,1);
            DecimalFormat d = new DecimalFormat("0.0000");
            System.out.println(d.format(res));
        }
    }
    public static int[] getInput(Scanner in){
        int a = in.nextInt();
        int b = in.nextInt();
        return new int[]{a,b};
    }

    public static void comp(int nn,int mm,int a,double p){
        if(nn==0)return;
        double n=nn;
        double m=mm;

        if(a==1){
            if(mm<0)return;
            //轮到A抽
            double luck = p*(n/(m+n));
            res+=luck;
            double notLuck = p*(m/(m+n));
            comp(nn,mm-1,2,notLuck);
        }else{
            if(m<=0)return;
            double notLuck = p*(m/(m+n));
            //第二次中的概率
            double luck=notLuck*((n/(m-1+n)));
            comp(nn-1,mm-1,1,luck);
            notLuck=notLuck*(((m-1)/(m-1+n)));
            comp(nn,mm-2,1,notLuck);
        }


    }
}
