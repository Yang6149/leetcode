package everydayLeet;

import org.junit.Test;

import java.util.*;

public class L1248 {
    public int numberOfSubarrays(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i<nums.length;i++){
            if((nums[i]&1)==1){
                list.add(i);
            }
        }
        int sum = 0;
        for(int i = 0;i+k<=list.size();i++){
            int leftNum = i==0?list.get(0)+1:list.get(i)-list.get(i-1);
            int rightNum = i+k==list.size()?nums.length-list.get(list.size()-1):list.get(i+k)-list.get(i+k-1);
            sum+=leftNum*rightNum;
        }
        return sum;
    }
    @Test
    public  void test(){
        System.out.println(numberOfSubarrays(new int[]{2, 2, 2, 1, 2, 2, 2, 1, 2, 2, 2,1,2,2,2}, 2));
    }
    @Test
    public void testa(){
        final double p = 0.993;
        double res = 1;
        int dianshu = 0;
        while(dianshu*150<17500){
            dianshu++;
            res*=p;
        }
        System.out.println(1-res);
    }
}
