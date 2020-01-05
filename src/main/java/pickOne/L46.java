package pickOne;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> lists=new ArrayList<>();
        go(nums,0,lists);
        return lists;
    }

    public void go(int [] nums,int index,List<List<Integer>> lists){
        if(index==nums.length-1){
            List<Integer> list=new ArrayList<Integer>();
            for (int num : nums) {
                list.add(num);
            }
            lists.add(list);
        }
        if(index>=nums.length-1){
            return;
        }
        for(int i=index;i<nums.length;i++){

            swap(nums,index,i);
            go(nums,index+1,lists);

            swap(nums,index,i);

        }
    }

    public void swap(int [] nums,int index1,int index2){
        int a=nums[index1];
        nums[index1]=nums[index2];
        nums[index2]=a;
    }
    @Test
    public void test(){
        int nums[] ={1,2,3};
        System.out.println(permute(nums));
    }
}
