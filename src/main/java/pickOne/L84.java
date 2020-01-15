package pickOne;

import org.junit.Test;

public class L84 {
    public int largestRectangleArea(int[] heights) {
        if(heights.length<1)return 0;
        int [] leftbigger=new int[heights.length];
        int [] rightbigger=new int[heights.length];
        leftbigger[0]=-1;
        rightbigger[heights.length-1]=heights.length;
        for(int i=1;i<heights.length;i++){
            int p=i-1;
            while(p>=0&&heights[p]>=heights[i]){
                p=leftbigger[p];
            }
            leftbigger[i]=p;
        }
        for(int i=heights.length-2;i>=0;i--){
            int p=i+1;
            while(p<heights.length&&heights[p]>=heights[i]){
                p=rightbigger[p];
            }
            rightbigger[i]=p;
        }
        int area=0;
        for(int i=0;i<heights.length;i++){
            area=Math.max(area,(rightbigger[i]-leftbigger[i]-1)*heights[i]);
        }
        return area;

    }

    @Test
    public void test(){
        int [] nums={1,1};
        System.out.println(largestRectangleArea(nums));
    }
}
