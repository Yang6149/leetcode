package sort;

import org.junit.Test;

public class HeadSort {

    //left = node*2+1;
    //right = node*2+2
    //建立最大堆
    int len;
    public void BuildMaxHeap(int [] nums){
        len = nums.length;
        for(int i = len/2;i>=0;i--){
            heapify(nums,i);
        }
    }
    public void heapify(int [] nums,int i){
        int left = i*2+1;
        int right = i*2+2;
        int largest = i;

        if(left<len && nums[left] > nums[largest]){
            largest = left;
        }

        if(right < len && nums[right] > nums[largest]){
            largest = right;
        }

        if(largest != i){
            SortUtil.swap(nums,i,largest);
            heapify(nums,largest);
        }
    }

    public void HeapSort(int [] nums){
        //建立最大堆
        for(int i=nums.length-1;i>0;i--){
            SortUtil.swap(nums,0,i);
            len--;
            heapify(nums,0);
        }
    }

    @Test
    public void test(){
        int [] nums = SortUtil.getRandom();
        BuildMaxHeap(nums);
        HeapSort(nums);
        System.out.println(SortUtil.judge(nums));
    }
}
