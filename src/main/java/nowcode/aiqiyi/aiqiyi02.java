package nowcode.aiqiyi;

import java.util.Scanner;

public class aiqiyi02 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int renshu=in.nextInt();
        int [] yaoqiu = new int[renshu];
        for (int i=0;i<renshu;i++){
            yaoqiu[i]=in.nextInt();
        }
        int index=0;
        int game=0;
        while(true){
            int min = Integer.MAX_VALUE;
            for(int i=0;i<yaoqiu.length;i++){
                if(yaoqiu[i]<min){
                    min=yaoqiu[i];
                    index=i;
                }
            }
            if (min==0)break;
            for(int i=0;i<yaoqiu.length;i++){
                if(i!=index){
                    yaoqiu[i]--;
                }
            }
            game++;

        }
        System.out.println(game);
    }
}
