package everydayLeet;

import java.util.*;

public class L56 {
    public int[][] merge(int[][] A) {
        if (A.length<=0)return A;
        Arrays.sort(A,(x,y)->x[0]-y[0]!=0?x[0]-y[0]:x[1]-y[1]);
        int begin = 0;
        List<Integer> head = new ArrayList<>();
        List<Integer> tail = new ArrayList<>();
        int [][] a = new int[A.length][];
        int index = 0;
        while(begin<A.length){
            if(a[index][1]>=A[begin][0]){
                a[index][0]=Math.max(tail.get(tail.size()-1),A[begin][1]);
            }else{
                index++;
                a[index][0] = A[begin][0];
                a[index][1] = A[begin][1];
            }
            begin++;
        }

        return Arrays.copyOf(a,index+1);
    }
}
