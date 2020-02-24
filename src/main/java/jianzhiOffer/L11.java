package jianzhiOffer;

import org.junit.Test;

public class L11 {
    public int minNumberInRotateArray(int [] array) {
        if(array==null||array.length<1)return 0;
        int left = 0;
        int right = array.length-1;
        while(left<right){
            int mid = left+(right-left)/2;
            if(array[mid]>array[right]){
                left=mid+1;
            }else{
                right=mid;
            }
        }
        return array[left];
    }

    @Test
    public void test(){
        System.out.println(minNumberInRotateArray(new int[]{3,4,5,1,2}));
    }
}
