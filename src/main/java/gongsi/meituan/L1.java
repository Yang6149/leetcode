package gongsi.meituan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class L1 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<Integer,ArrayList<Integer>> map = new HashMap();
        for(int i=0;i<n-1;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            if(!map.containsKey(a)){
                map.put(a,new ArrayList<Integer>());
            }
            map.get(a).add(b);
            if(!map.containsKey(b)){
                map.put(b,new ArrayList<Integer>());
            }
            map.get(b).add(a);
        }
        System.out.println((n-1)*2-move(map,1)+1);
    }
    public static int move(HashMap<Integer,ArrayList<Integer>> map,int cur){
        int maxDeep=0;
        if(map.get(cur)==null)return 1;
        for(int i:map.get(cur)){
            maxDeep = Math.max(maxDeep,move(map,i));
        }
        return maxDeep+1;
    }

}
