package pickOne;

import org.junit.Test;

public class L85 {
    public int maximalRectangle(char[][] matrix) {
        if(matrix.length<1||matrix[0].length<1)return 0;
        int [] heights=new int[matrix[0].length];
        int [] left=new int[matrix[0].length];
        int [] right=new int[matrix[0].length];
        for(int i=0;i<right.length;i++){
            right[i]=right.length;
        }
        int area=0;
        for(int i=0;i<matrix.length;i++){
            int curleft=0;
            int curright=right.length;
            for(int j=0;j<right.length;j++){
                if(matrix[i][j]=='1'){
                    heights[j]++;
                    left[j]=Math.max(curleft,left[j]);

                }else{
                    heights[j]=0;
                    left[j]=0;
                    curleft=j+1;
                }
            }
            for(int j=right.length-1;j>=0;j--){
                if(matrix[i][j]=='1'){
                    right[j]=Math.min(curright,right[j]);
                }else {
                    right[j]=right.length;
                    curright=j;
                }
            }
            for(int j=0;j<right.length;j++){
                area=Math.max(area,(right[j]-left[j])*heights[j]);
            }

        }
        return area;
    }
    @Test
    public void test(){
        //char [][] matrix={{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
        char [][] matrix={{'1'}};
        System.out.println(maximalRectangle(matrix));
    }
}
