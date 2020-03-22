package contest.contest181;

import org.junit.Test;

import java.util.ArrayList;

public class L2 {
    public int sumFourDivisors(int[] nums) {
        int sum = 0;
        ArrayList<Integer> cur;
        for (int num : nums) {
            if ((cur=has4(num))!=null){
                for (Integer integer : cur) {
                    sum+=integer;
                }
            }
        }
        return sum;
    }

    public ArrayList<Integer> has4(int num){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=1;i*i<(num);i++){
            if(num%i==0){
                if(list.size()>3){
                    return null;
                }
                list.add(i);
                list.add(num/i);
            }
        }
        if(list.size()!=4)return null;
        return list;

    }

    @Test
    public void test(){
        sumFourDivisors(new int[]{21,4,7});
    }
}
