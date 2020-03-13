package interview100;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class L51 {
    List<List<String>> res = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        int [] qqq = new int[n];
        dd(qqq,0,n);
        return res;
    }
    public void dd(int [] qqq,int level,int n){
        if(level==n){
            List<String> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                String s = "";
                for (int i1 = 0; i1 < n; i1++) {
                    if(qqq[i]==i1){
                        s+='R';
                    }else{
                        s+='.';
                    }
                }
                list.add(s);

            }
            res.add(list);
            return;
        }
        for(int i=0;i<n;i++){
            qqq[level]=i;
            if(isOk(qqq,level+1)){
                dd(qqq,level+1,n);
            }
        }
    }

    public boolean isOk(int [] qqq,int now){
        HashSet<Integer> hang = new HashSet<>();
        HashSet<Integer> xie1 = new HashSet<>();
        HashSet<Integer> xie2 = new HashSet<>();
        for(int i=0;i<now;i++){
            if(hang.contains(qqq[i]))return false;
            hang.add(qqq[i]);
        }
        for(int i=0;i<now;i++){
            if(xie1.contains(qqq[i]+i))return false;
            xie1.add(qqq[i]+i);
        }
        for(int i=0;i<now;i++){
            if(xie2.contains(qqq[i]-i))return false;
            xie2.add(qqq[i]-i);
        }
        return true;
    }

    @Test
    public void tets(){

        System.out.println(solveNQueens(4));
    }
}
