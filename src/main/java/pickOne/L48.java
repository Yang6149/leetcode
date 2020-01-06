package pickOne;

import org.junit.Test;

public class L48 {
    public void rotate(int[][] matrix) {
        int endi,endj=0;
        if((matrix.length&1)==1){
            endi=(matrix.length-1)/2;
            endj=(matrix.length-1)/2-1;
            System.out.println("单数");
        }else{
            System.out.println("复数");
            endi=(matrix.length-1)/2;
            endj=(matrix.length-1)/2;
        }
        int num=(matrix.length-1)/2;  //3  1     4  1
        for(int i=0;i<=endi;i++){
            for(int j=0;j<=endj;j++){
                System.out.println(i+"   "+j);
                if((matrix.length&1)==1&&i==endi){

                    int a=matrix[i][j];
                    int n=matrix.length-1;
                    matrix[i][j]=matrix[n-j][i];
                    matrix[n-j][i]=matrix[i][n-j];
                    matrix[i][n-j]=matrix[j][i];
                    matrix[j][i]=a;
                }else{
                    change4(matrix,i,j);

                }
            }
        }

    }

    // 0,0            0,n
    //...
    // n,i            n,n
    //i,j->   i,n-j  ->    n-i,n-j    ->     n-i,j
    public void change4(int [][] nums,int i,int j){
        int n=nums.length-1;

        int a=nums[i][j];
        nums[i][j]=nums[n-j][i];
        nums[n-j][i]=nums[n-i][n-j];
        nums[n-i][n-j]=nums[j][n-i];
        nums[j][n-i]=a;
    }
    @Test
    public void test(){
        //int [][]nums={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int [][]nums={{1,2,3},{4,5,6,},{7,8,9}};
        for (int[] num : nums) {
            for (int i : num) {
                System.out.print(i+"\t");
            }
            System.out.println();
        }
        rotate(nums);
        for (int[] num : nums) {
            for (int i : num) {
                System.out.print(i+"\t");
            }
            System.out.println();
        }
    }
}
