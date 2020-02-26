package gongsi.meituan;

import java.util.ArrayList;
import java.util.Scanner;

public class L1 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int [][] bian = new int[num-1][2];
        for(int i=0;i<bian.length;i++){
            bian[i][0]=in.nextInt();
            bian[i][1]=in.nextInt();
        }
        int deep = 0;
        int cur=0;
        ArrayList<Integer>[] arrays = new ArrayList [num+1];
        for(int i=0;i<bian.length;i++){
            if(arrays[bian[i][0]]==null){
                arrays[bian[i][0]]=new ArrayList<Integer>();
            }
            arrays[bian[i][0]].add(bian[i][1]);
        }
        deep = de(arrays,1)-1;
        System.out.println((num-1)*2-deep);
    }
    public static int de(ArrayList<Integer> [] arrays,int cur){
        int max=0;
        for(int i:arrays[cur]){
            if(arrays[i]==null){
                max=1;
                continue;
            }
            max=Math.max(max,de(arrays,i));
        }
        return max+1;

    }

}
