package contest.contest182;

import org.junit.Test;

public class L2 {
    public int numTeams(int[] A) {
        int res = 0;

        int leftMinNum [] = new int [A.length];
        int rightMaxNum [] = new int [A.length];
        int leftMaxNum [] = new int [A.length];
        int rightMinNum [] = new int [A.length];

        for(int i=1;i<A.length;i++){
            int leftmin = 0;
            int leftmax = 0;
            for(int j=0;j<i;j++){
                if(A[i]>A[j])leftmin++;
                if(A[i]<A[j])leftmax++;
            }
            leftMinNum[i]=leftmin;
            leftMaxNum[i]=leftmax;
        }
        for(int i=A.length-2;i>=0;i--){
            int rightmax = 0;
            int rightmin = 0;
            for(int j=A.length-1;j>i;j--){
                if(A[i]<A[j])rightmax++;
                if(A[i]>A[j])rightmin++;
            }
            rightMaxNum[i]=rightmax;
            rightMinNum[i]=rightmin;
        }
        for(int i=1;i<A.length-1;i++){
            res+=leftMinNum[i]*rightMaxNum[i];
            res+=leftMaxNum[i]*rightMinNum[i];
        }

        return res;
    }

    @Test
    public void test(){
        int nums [] = {1,2,3,4};
        System.out.println(numTeams(nums));
    }
}
