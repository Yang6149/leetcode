package like100;

import org.junit.Test;

public class L63 {
    public int minPathSum(int[][] grid) {
        if(grid.length==0||grid[0].length==0)return 0;
        int steps[][]=new int[grid.length][grid[0].length];
        return get(steps,grid.length-1,grid[0].length-1,grid);
    }

    public int get(int [][] step,int maxM,int maxN,int [][]values){
        System.out.println(maxM);
        System.out.println(maxN);
        for(int m=maxM;m>=0;m--){
            for(int n=maxN;n>=0;n--){
                if(m==maxM&&n==maxN){
                    step[m][n]=values[m][n];
                    continue;
                }
                if(m==maxM){
                    step[m][n]=step[m][n+1]+values[m][n];
                    continue;
                }
                if(n==maxN){
                    step[m][n]=step[m+1][n]+values[m][n];
                    continue;
                }

                step[m][n]=Math.min(step[m][n+1],step[m+1][n])+values[m][n];
            }
        }
        return step[0][0];


    }
    @Test
    public void test(){
        int [][] values={{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(minPathSum(values));
    }
}
