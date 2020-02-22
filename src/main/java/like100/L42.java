package like100;

import org.junit.Test;

/**
 * 时间复杂度为o(N) 空间复杂度为o(1)
 * 每一次lefr 和 right 进行比较 ，大的那个树是目前为止最大的数，比如是right
 * 把left 和 maxLeft 进行比较 差值累加到 res 里
 */
public class L42 {
    public int trap(int[] height) {

        int left = 0;
        int right = height.length-1;
        int res = 0;
        int maxLeft = 0;
        int maxRight = 0;
        while(left<right){
            if(height[left]>=height[right]){
                if(height[right]>=maxRight){
                    maxRight=height[right];
                }else{
                    res+=maxRight-height[right];
                }
                right--;
            }else{
                if(height[left]>=maxLeft){
                    maxLeft = height[left];
                }else{
                    res+=maxLeft-height[left];
                }
                left++;
            }
        }
        return res;
    }
    @Test
    public void test(){
        int [] nums={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(nums));
    }
}
