package pickOne;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class L39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);

        List<List<Integer>> lists=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        dua(lists,list,target,0,candidates,0);
        return lists;
    }

    public void dua(List<List<Integer>> lists,List<Integer> list,int target,int init,int [] candidates,int begin){
        for(int i=begin;i<candidates.length;i++){
            int sum=init;
            sum=sum+candidates[i];
            if(sum<=target){
                List<Integer> newlist=new ArrayList<>(list.size()+1);
                for(int obj:list){
                    newlist.add(obj);
                }
                //List<Integer> newlist=new ArrayList<>(Arrays.asList(new Integer[list.size()]));
                //Collections.copy(newlist,list);
                newlist.add(candidates[i]);
                if(sum==target){
                    lists.add(newlist);
                }else{
                    dua(lists,newlist,target,sum,candidates,i);
                }
            }else{
                return;
            }

        }
    }
    @Test
    public void test(){
        int [] nums={8,7,4,3};
        System.out.println(combinationSum(nums,7));
    }
}
