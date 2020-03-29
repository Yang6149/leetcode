package gongsi.baidu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class L3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            getNum(in);
        }
    }

    public static void getNum(Scanner in){
        int num = in.nextInt();
        int [] quan = new int[num];
        for(int i=0;i<num;i++){
            quan[i]=in.nextInt();
        }
        //Arrays.sort(quan,(a,b)->a[1]-b[1]);
        ArrayList<Integer> [] list = new ArrayList[num+1];
        for(int i=1;i<=num;i++){
            list[i]=new ArrayList<>();
        }
        for(int i=0;i<num-1;i++){
            int u = in.nextInt();
            int v = in.nextInt();
            if(u>v){
                list[v].add(u);
            }else{
                list[u].add(v);
            }
        }
        int res[] = new int[1];
        for(int i=1;i<=quan.length;i++){
            bianli(quan,0,res,list,i);
        }
        System.out.println(res[0]);

    }
    public static  void bianli(int [] quan,int level,int res[],ArrayList<Integer> []list,int index){
        if(list[index].size()==0)return;
        for (Integer integer : list[index]) {
            res[0]=Math.max(res[0],level);
            bianli(quan,level+1,res,list,integer);
        }
    }
}
