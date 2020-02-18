package contest.contest176;

import org.junit.Test;

public class L1351 {
    class Solution {
        public int countNegatives(int[][] grid) {
            if(grid.length<1||grid[0].length<1)return 0;
            int res = 0;
            for(int i=0;i<grid.length;i++){
                for(int j=0;j<grid[0].length;j++){
                    if(grid[i][j]<0){
                        res++;
                    }
                }
            }
            return res;
        }
    }


    @Test
    public void test(){

    }
}
