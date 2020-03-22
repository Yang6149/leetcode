package contest.contest181;

import org.junit.Test;

import java.util.LinkedList;

public class L1 {
    public int[] createTargetArray(int[] nums, int[] index) {
        int [][] p = {nums,index};
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            int indexa = index[i];
            int value = nums[i];
            list.add(indexa,value);

        }
        Integer [] res = new Integer[list.size()];
        Integer[] ints = (Integer[])list.toArray(res);
        int ss[] =new int[res.length];
        for (int i = 0; i < ss.length; i++) {
            ss[i]=res[i];
        }
        return ss;
    }

    @Test
    public void test(){
        int [] nums = {0,1,2,3,4};
        int [] index = {0,1,2,2,1};
        createTargetArray(nums,index);
    }
}
