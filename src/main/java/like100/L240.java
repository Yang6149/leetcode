package like100;

public class L240 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length<1||matrix[0].length<1)return false;
        int row=0;
        int col=matrix[0].length-1;
        while (row<matrix.length&&col>=0){
            if(matrix[row][col]==target)return true;
            if(matrix[row][col]>target){
                col--;
                continue;
            }
            if(matrix[row][col]<target)row++;
        }
        return false;
    }
}
