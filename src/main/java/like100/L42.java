package like100;

import org.junit.Test;

public class L42 {
    public int trap(int[] height) {
        //find a begin;
        //find next by index until value of index >=begin
        //找到了最大的，之后不算了
        //全部反向找一边直到begin
        int begin=0;
        int sum=0;
        for(int i=1;i<height.length;i++){
            if(height[begin]<=height[i]){
                for(int j=begin+1;j<i;j++){
                    sum+=height[begin]-height[j];
                }
                begin=i;
            }
        }
        int begin2=height.length-1;
        for(int i=height.length-2;i>=begin;i--){
            if(height[begin2]<height[i]){
                for(int j=begin2-1;j>i;j--){
                    sum+=height[begin2]-height[j];
                }
                begin2=i;
            }
        }
        return sum;
    }
    @Test
    public void test(){
        int [] nums={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(nums));
    }
}
