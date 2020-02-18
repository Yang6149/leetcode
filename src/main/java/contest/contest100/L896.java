package contest.contest100;

import like100.TreeNode;

import java.util.ArrayDeque;
import java.util.Queue;

public class L896 {
    public boolean isMonotonic(int[] A) {
        boolean pan=false ;
        boolean zheng=false;
        for(int i=1;i<A.length;i++){
            if(pan==false){
                if(A[i]>A[i-1]){
                    pan=true;
                    zheng=true;
                }
                if(A[i]<A[i-1]){
                    pan=true;
                    zheng=false;
                }
                continue;
            }
            if(zheng){
                if(A[i]<A[i-1])return false;
            }
            if(!zheng){
                if(A[i]>A[i-1])return false;
            }
        }
        return true;
    }
}
