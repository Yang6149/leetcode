package contest.contest171;

import org.junit.Test;

public class L1 {
    public int[] getNoZeroIntegers(int n) {
        for(int i=1;i<n/2+1;i++){
            int res=n-i;
            if(iszero(res)&&iszero(i))return new int[]{i,res};
        }
        return new int[2];
    }
    public boolean iszero(int n){
        while(n>0){
            if(n%10==0){
                return false;
            } else{
                n/=10;
            }
        }
        return true;
    }
    @Test
    public void test(){
        for (int noZeroInteger : getNoZeroIntegers(2)) {
            System.out.println(noZeroInteger);
        }
    }
}
