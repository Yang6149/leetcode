package csnote.greedy;

import org.junit.Test;

import java.util.Arrays;

public class L455 {
    public int findContentChildren(int[] g, int[] s) {
//        Arrays.sort(g);
//        Arrays.sort(s);
//        int res=0;
//        for(int child:g){
//            int choice=0;
//            int index=-1;
//            if(child>0){
//                boolean isover=false;
//                do {
//                    isover=false;
//                    for(int i=0;i<s.length;i++){
//                        if (s[i]!=0)isover=true;
//                        if((index==-1&&s[i]!=0)||s[i]>=child){
//                            choice=s[i];
//                            index=i;
//                            if(s[i]>=child){
//                                break;
//                            }
//                        }
//                    }
//                    if(index==-1)return res;
//                    child-=choice;
//                    s[index]=0;
//                }while(isover);
//
//            }
//            if(child<=0)res++;
//        }
//        return res;
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0;
        for(int j=0;i<g.length && j<s.length;j++) {
            if(g[i]<=s[j]) i++;
        }
        return i;
    }
    @Test
    public void test(){
        int [] g = {2,8};
        int [] s = {1,1,1,1,1,1,2,2,};
        System.out.println(findContentChildren(g,s));
    }
}
