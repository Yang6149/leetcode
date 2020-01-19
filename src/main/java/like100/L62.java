package like100;

import org.junit.Test;

public class L62 {
    public int uniquePaths(int m, int n) {
        int [][] steps=new int[m][n];
        return get(steps,m-1,n-1);

    }
    public int get(int [][] step,int maxM,int maxN){

        for(int m=maxM;m>=0;m--){
            for(int n=maxN;n>=0;n--){
                if(m==maxM||n==maxN){
                    step[m][n]=1;
                    continue;
                }

                step[m][n]=step[m+1][n]+step[m][n+1];
            }
        }
        return step[0][0];


    }
    @Test
    public void test(){
        System.out.println(uniquePaths(7,3));
    }
}
