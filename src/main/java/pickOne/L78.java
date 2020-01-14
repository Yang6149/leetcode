package pickOne;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L78 {
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<List<Integer>> lists=new ArrayList<>();
        didi(lists,new ArrayList<Integer>(),nums,0);
        return lists;
    }
    public void didi(ArrayList<List<Integer>> lists,List<Integer> list,int [] nums,int start){
        lists.add(new ArrayList<>(list));
        for(int i=start;i<nums.length;i++){
            list.add(nums[i]);
            didi(lists,list,nums,i+1);
            list.remove(list.size()-1);
        }
    }

    @Test
    public void test(){
        //int [] a={1,2,3};
        //System.out.println(subsets(a));
        ArrayList<SASA> a=new ArrayList<>();
        SASA a1=new SASA();
        a.add(a1);
        ArrayList<SASA> b=new ArrayList<>(a);
        System.out.println(a);
        System.out.println(b);

        a1.a=1;
        a1.b=3;
        a.add(new SASA());
        System.out.println();
        System.out.println(a);
        System.out.println(b);

        System.out.println();
        ArrayList<Integer> A=new ArrayList<>();
        //A.add()
    }
    class SASA{
        int a;
        int b;

        @Override
        public String toString() {
            return "SASA{" +
                    "a=" + a +
                    ", b=" + b +
                    '}';
        }
    }
}
