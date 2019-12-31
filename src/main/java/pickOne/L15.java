package pickOne;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class L15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            if(i!=0){
                if(nums[i]==nums[i-1]){
                    continue;
                }
            }
            int begin=i+1;
            int end=nums.length-1;
            while(begin<end){
                if(begin!=i+1&&nums[begin]==nums[begin-1]){
                    begin++;
                    continue;
                }
                int sum = nums[begin]+nums [end];
                if (sum + nums[i]==0){
                    List<Integer>numsList =new ArrayList<Integer>();
                    numsList.add(nums[begin]);
                    numsList.add(nums[end]);
                    numsList.add(nums[i]);
                    lists.add(numsList);
                    begin ++;
                    end --;
                    continue;
                }else if(sum+nums[i]<0){
                    begin ++;
                }
                else {
                    end --;
                }
            }
        }
        return lists;

    }

    @Test
    public void test(){
        int [] nums={-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(nums));
    }
}
