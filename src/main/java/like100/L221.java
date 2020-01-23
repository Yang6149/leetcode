package like100;

import org.junit.Test;

public class L221 {
    public int maximalSquare(char[][] matrix) {
        int max=0;
        if(matrix.length<1)return 0;
        int count[][] = new int[matrix.length][];
        for(int i=0;i<count.length;i++){
            count[i]=new int[matrix[i].length];
        }
        for (int i=0;i<count.length;i++){
            count[i][0]=matrix[i][0]-'0';
            max=Math.max(max,count[i][0]);
        }
        for (int j=0;j<matrix[0].length;j++){
            count[0][j]=matrix[0][j]-'0';
            max=Math.max(max,count[0][j]);
        }
        for (int i=1;i<matrix.length;i++){
            for (int j=1;j<matrix[i].length;j++){
                int left=count[i][j-1],up=count[i-1][j],leftUp=count[i-1][j-1];
                if(matrix[i][j]=='1'){
                    count[i][j]=Math.min(Math.min(left,up),leftUp)+1;
                    max=Math.max(max,count[i][j]);
                }
            }
        }
        return max*max;
    }
    @Test
    public void test(){
        char [][] nums= {{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
        System.out.println(maximalSquare(nums));
    }
}
