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
        return null;

    }

    @Test
    public void test(){
        int [] nums={-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(nums));
    }
}
